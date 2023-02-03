package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Map;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@Controller
public class HomeController {


//    @GetMapping("/hello")
    public String hello(Map<String, Object> map) {
        String userName = getUserName();
        System.out.println("userName = " + userName);
        map.put("username", userName);
        return "hello";
    }

    public String getUserName() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getRemoteUser();
    }
}
