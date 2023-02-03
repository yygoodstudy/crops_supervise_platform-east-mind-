package com.example.controller;

import com.example.entity.GrowthRecord;
import com.example.service.GrowthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 追肥除草长势记录
 */
@RestController
public class GrowthRecordController {
    @Autowired
    private GrowthRecordService growthRecordService;

    @GetMapping("/listGrowRecord")
    public List<GrowthRecord> listGrowRecord(String farmerName) {
        return growthRecordService.listGrowRecord(farmerName);
    }
}
