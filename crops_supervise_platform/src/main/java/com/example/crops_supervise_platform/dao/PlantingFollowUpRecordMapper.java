package com.example.crops_supervise_platform.dao;

import com.example.crops_supervise_platform.entity.PlantingFollowUpRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantingFollowUpRecordMapper {

    // 通过种植户姓名查询种植跟进记录信息
    List<PlantingFollowUpRecord> listPlantingFollowUpRecord(String farmerName);
}
