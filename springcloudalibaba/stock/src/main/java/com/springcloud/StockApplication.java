package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 库存服务，一个服务可以看作一个nacos的客户端，一个客户端既可以当作消费者，也可以当作提供者
 * 服务的调用者是服务的消费者，被调用的服务视为服务的提供者
 */
@SpringBootApplication
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class);
    }

    @Bean
    @LoadBalanced // 负载均衡注解
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
