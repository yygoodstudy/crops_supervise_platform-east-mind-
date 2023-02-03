package com.example.service;

import com.example.entity.GrowthRecord;

import java.util.List;

public interface GrowthRecordService {
    List<GrowthRecord> listGrowRecord(String farmerName);
}
