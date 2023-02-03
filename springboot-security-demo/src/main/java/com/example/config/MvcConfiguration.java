package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@Configuration
public class MvcConfiguration implements WebMvcConfigurer {

    /*
     当项目中涉及大量的页面跳转，我们可以使用addViewControllers方法实现无业务逻辑跳转，从而减少控制器代码的编写。
addViewControllers方法可以实现将一个请求直接映射为视图，不需要编写控制器来实现，从而简化了页面跳转
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
    }
}
