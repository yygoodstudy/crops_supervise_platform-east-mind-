package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanyao
 * @Date 2022/12/9
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Value("${server.port}")
    String port;

    @GetMapping("/save")
    public String order() {
        return port + "：生成一条订单信息";
    }
}
