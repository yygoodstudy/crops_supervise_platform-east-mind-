package com.example.crops_supervise_platform.service.impl;

import com.example.crops_supervise_platform.dao.GrowthRecordMapper;
import com.example.crops_supervise_platform.entity.GrowthRecord;
import com.example.crops_supervise_platform.service.GrowthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrowthRecordServiceImpl implements GrowthRecordService {

    @Autowired
    private GrowthRecordMapper mapper;

    @Override
    public List<GrowthRecord> listGrowRecord(String farmerName) {
        return mapper.listGrowRecord(farmerName);
    }
}
