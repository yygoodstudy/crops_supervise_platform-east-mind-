package com.example.javabasic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable{
    private String username;
    private String password;
    private Integer age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
