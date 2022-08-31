package com.example.crops_supervise_platform.controller;

import com.example.crops_supervise_platform.entity.DamageCompensateRecord;
import com.example.crops_supervise_platform.service.DamageCompensateRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DamageCompensateRecordController {
    @Autowired
    private DamageCompensateRecordService compensateRecordService;

    /**
     * 受灾理赔记录查询
     */
    @GetMapping("listDamageCompensateRecord")
    public List<DamageCompensateRecord> listDamageCompensateRecord(String farmerName) {
        return compensateRecordService.listDamageCompensateRecord(farmerName);
    }
}
