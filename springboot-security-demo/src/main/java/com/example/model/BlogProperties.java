package com.example.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@Component
@Data
public class BlogProperties {

    @Value("${com.eastmind.blog.name}") // 读取配置文件中自定义的属性值
    private String name;
    @Value("${com.eastmind.blog.price}")
    private double price;
    @Value("${com.eastmind.blog.desc}")
    private String desc;
}
