package com.springcloud.controller;

import com.springcloud.common.util.HttpClientUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author yuanyao
 * @Date 2022/12/9
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Resource
    private RestTemplate restTemplate;
    final String url = "http://127.0.0.1:8080/order/save";

    @GetMapping("/delete")
    public String stock() {
        String result = HttpClientUtil.doGet(url);
        System.out.println("调用订单服务返回结果： = " + result);
        return "库存-1";
    }

    @GetMapping("/discount")
    public String discountStock() {
        String url = "http://order-service/order/save";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);
        return result;
    }
}
