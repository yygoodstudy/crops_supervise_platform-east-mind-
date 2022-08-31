package com.example.crops_supervise_platform.controller;

import com.example.crops_supervise_platform.entity.PlantingFollowUpRecord;
import com.example.crops_supervise_platform.service.PlantingFollowUpRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 种植跟进记录
 */
@RestController
public class PlantingFollowUpRecordController {
    @Autowired
    private PlantingFollowUpRecordService followUpRecordService;

    @GetMapping("/listPlantingFollowUpRecord")
    public List<PlantingFollowUpRecord> listPlantingFollowUpRecord(@RequestParam(value = "farmerName",required = false) String farmerName){
        return followUpRecordService.listPlantingFollowUpRecord(farmerName);
    }
}
