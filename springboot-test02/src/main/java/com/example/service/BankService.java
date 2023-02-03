package com.example.service;

import com.example.model.BankInfo;
import org.springframework.web.bind.annotation.*;

/**
 * 测试在接口上@RestController能不能成功请求,结果可以成功，前提是给接口提供一个实现类，并且实现类要加入到spring容器中
 */
@RestController
@RequestMapping("/bankinfo")
public interface BankService {

    @GetMapping("/page")
    BankInfo bankInfo(Integer id);

    @PostMapping("saveBank")
    String saveBank(@RequestBody BankInfo bankInfo); // 如果不加@RequestBody注解，前端传的Json数据无法给bankInfo赋值
}
