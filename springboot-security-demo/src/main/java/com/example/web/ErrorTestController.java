package com.example.web;

import com.example.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@RestController
public class ErrorTestController {

//    @GetMapping("/hello")
    public String hello() throws Exception {
        throw new Exception("Error Controller中发生了异常！");
    }

    @GetMapping("/mathError")
    public String zeroError() {
        return String.valueOf(1/0);
    }

    @GetMapping("/json")
    public String json() throws MyException {
        throw new MyException("发生了异常！");
    }
}
