package com.music.forum.controller;
import com.music.forum.pojo.SysUser;
import com.music.forum.pojo.vo.LoginVo;
import com.music.forum.result.Result;
import com.music.forum.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import com.music.forum.service.UserService;
import com.music.forum.utils.BaseController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static com.music.forum.utils.MD5.MD5WithSaltForLogin;


@Controller
@RequestMapping("/users")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/find")
    @ResponseBody
    public Object findAll(){
        Object a = userService.findAll();
        System.out.println(a);
        return  a;
    }


    // 设置CORS的注解
    @CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody LoginVo loginVo,HttpServletResponse resp, HttpServletRequest  req) {

        String username = loginVo.getUsername();
        List<LoginVo> loginVos = userService.getUserInfoByUserName(username);
        //如果用户不存在
        if (Objects.isNull(loginVos.get(0).getUsername())) {

            Object o = new Object();
            return Result.fail(o);
//            throw new RuntimeException("用户名不存在");
        }
        // 判断密码是否一致
        String md5WithSalt = MD5WithSaltForLogin(loginVo.getPassword(), loginVos.get(0).getPassword());
        for (LoginVo loginUser : loginVos) {
            if (loginUser.getPassword().equals(md5WithSalt)) {
                List<String> rights = new ArrayList<>();

                for (LoginVo user : loginVos) {
                    if (user.getPath() != null) {
                        rights.add(user.getPath());
                    }
                }

                loginUser.setRights(rights);

                //脱敏 看具体需求
                loginUser.setPassword("");
                //生成token,加入redis,redis时间是jwt时间的2倍.
                String token = JwtUtils.getToken(loginUser, 20 * 60 * 1000);
                ValueOperations ops = redisTemplate.opsForValue();
//                redis中存token
                ops.set(token, token, 40 * 60 * 1000, TimeUnit.MILLISECONDS);
//                向父cookie中存入token
                super.setCookieVal(resp,req, "token", token);

                return Result.ok(loginUser);
            }
        }
        throw new RuntimeException("密码错误");
    }

    //用户登出

    // 设置CORS的注解
//    @CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
    @RequestMapping("/logout")
    @ResponseBody
    public Result<Object> logout(HttpServletResponse resp, HttpServletRequest  req) {
        super.setCookieVal(resp, req,"token", "");
        return Result.ok();
    }



}