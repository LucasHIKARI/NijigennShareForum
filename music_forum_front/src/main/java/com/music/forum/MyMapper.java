package com.music.forum;

/**
 * @Auther: Lucas
 * @Description:
 * 该类不可被 Spring IoC 扫描到
 */
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}