package com.example.crops_supervise_platform.service;

import com.example.crops_supervise_platform.entity.PlantingFollowUpRecord;

import java.util.List;

public interface PlantingFollowUpRecordService {
    // 通过种植户姓名查询种植跟进记录信息
    List<PlantingFollowUpRecord> listPlantingFollowUpRecord(String farmerName);
}
