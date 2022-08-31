package com.example.crops_supervise_platform.dao;

import com.example.crops_supervise_platform.entity.GrowthRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrowthRecordMapper {
    List<GrowthRecord> listGrowRecord(String farmerName);
}
