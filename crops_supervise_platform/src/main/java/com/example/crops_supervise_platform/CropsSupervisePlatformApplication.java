package com.example.crops_supervise_platform;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.crops_supervise_platform.dao")
public class CropsSupervisePlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(CropsSupervisePlatformApplication.class, args);
    }

}
