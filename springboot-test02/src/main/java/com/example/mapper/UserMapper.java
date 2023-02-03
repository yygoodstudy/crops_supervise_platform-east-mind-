package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    /**
     * 自定义方法，查询所有用户的用户名
     *
     * @return
     */
    @Select("select name from user")
    List<String> listAllUserName();

    /**
     * 自定义方法：查询所有用户的email并封装到User对象当中
     *
     * @return
     */
    @Select("select email from user")
    @Results(@Result(column = "email", property = "email"))
    List<User> listAllUserEmail();
}
