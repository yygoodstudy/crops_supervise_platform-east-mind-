package com.example.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@Data
@TableName("users")
public class Users {

    @TableId
    private Long id;
    private String username;
    private String password;
}
