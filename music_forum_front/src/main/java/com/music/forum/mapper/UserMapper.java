package com.music.forum.mapper;

import com.music.forum.pojo.User;
import com.music.forum.pojo.vo.LoginVo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from sys_user")
    public List<User> findAll();

    List<LoginVo>  loginUser(String username) ;
}


