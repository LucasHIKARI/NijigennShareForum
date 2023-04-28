package com.music.forum.service;


import com.music.forum.pojo.User;
import com.music.forum.pojo.vo.LoginVo;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    List<LoginVo> getUserInfoByUserName(String username);
}