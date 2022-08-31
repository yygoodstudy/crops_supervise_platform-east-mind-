package com.example.crops_supervise_platform.service;

import com.example.crops_supervise_platform.entity.GrowthRecord;

import java.util.List;

public interface GrowthRecordService {
    List<GrowthRecord> listGrowRecord(String farmerName);
}
