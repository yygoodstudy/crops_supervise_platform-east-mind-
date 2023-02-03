package com.example.service;

import com.example.entity.PlantingFollowUpRecord;

import java.util.List;

public interface PlantingFollowUpRecordService {
    // 通过种植户姓名查询种植跟进记录信息
    List<PlantingFollowUpRecord> listPlantingFollowUpRecord(String farmerName);
}
