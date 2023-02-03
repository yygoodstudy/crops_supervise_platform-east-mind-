package com.example.dao;

import com.example.entity.GrowthRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrowthRecordMapper {
    List<GrowthRecord> listGrowRecord(String farmerName);
}
