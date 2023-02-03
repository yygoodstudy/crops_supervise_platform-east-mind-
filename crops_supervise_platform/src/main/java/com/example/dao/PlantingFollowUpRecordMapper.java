package com.example.dao;

import com.example.entity.PlantingFollowUpRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantingFollowUpRecordMapper {

    // 通过种植户姓名查询种植跟进记录信息
    List<PlantingFollowUpRecord> listPlantingFollowUpRecord(String farmerName);
}
