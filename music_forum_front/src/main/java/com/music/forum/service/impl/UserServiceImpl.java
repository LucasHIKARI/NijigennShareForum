package com.music.forum.service.impl;

import com.music.forum.mapper.SysUserMapper;
import com.music.forum.pojo.User;
import com.music.forum.mapper.UserMapper;
import com.music.forum.pojo.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.music.forum.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
@Autowired
public SysUserMapper sysUserMapper;
    public List<User> findAll(){
        return  userMapper.findAll();
    }

    @Override
    public List<LoginVo> getUserInfoByUserName(String username) {
        return userMapper.loginUser(username);
    }
}