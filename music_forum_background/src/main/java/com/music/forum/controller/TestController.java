//package com.music.forum.controller;
//
//import com.music.forum.service.RedisBaiseTakes;
////import com.zxm.bean.SeeUser;
////import com.zxm.util.redistakes.RedisBaiseTakes;
////import com.zxm.util.tools.CommTools;
////import com.zxm.util.tools.GetUserInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by zxm on 2017/8/7.
// *
// */
//@RestController
//@RequestMapping("test")
//public class TestController {
//
////    @Resource(name="seeUserRedisTakes")
//    @Autowired
//    @Qualifier(value="seeUserRedisTakes")
//    private RedisBaiseTakes seeUserRedisTakes;
//
//    @RequestMapping("/hello.do")
//    public ModelAndView hello(){
//        ModelAndView mv = new ModelAndView();
//        System.out.println("hello see");
//        seeUserRedisTakes.add("hello1","zxm");
//        mv.setViewName("hello");
//        return mv;
//    }
////    @RequestMapping("/hello2.do")
////    public ModelAndView hello2(HttpServletRequest request){
////        ModelAndView mv = new ModelAndView();
////        SeeUser seeUser = new SeeUser();
////        seeUser.setId("1");
////        seeUser.setIp(GetUserInfo.getIpAddr(request));
////        seeUser.setSeeTime(CommTools.getNoewTime("yyyy-MM-dd HH:mm:ss"));
////        seeUser.setSeeCount(1);
////        seeUserRedisTakes.addObj("seeUser",seeUser.getId(),seeUser);
////        mv.setViewName("hello");
////        return mv;
////    }
////    @RequestMapping("/hello3.do")
////    public ModelAndView hello3(HttpServletRequest request){
////        ModelAndView mv = new ModelAndView();
////        SeeUser seeUser = (SeeUser) seeUserRedisTakes.getObj("seeUser","1");
////        if(seeUser!=null){
////            System.out.println(seeUser.getId()+"======="+seeUser.getIp()+"======"+seeUser.getSeeTime()+"======="+seeUser.getSeeCount());
////        }
////
////        mv.setViewName("hello");
////        return mv;
////    }
//
//}
