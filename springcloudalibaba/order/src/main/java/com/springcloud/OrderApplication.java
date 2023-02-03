package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 订单服务，一个服务可以看作一个nacos的客户端
 *
 */
@SpringBootApplication
public class OrderApplication {
    public static void main( String[] args ) {
        SpringApplication.run(OrderApplication.class);
    }
}
