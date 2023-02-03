package com.example.service.impl;

import com.example.dao.GrowthRecordMapper;
import com.example.entity.GrowthRecord;
import com.example.service.GrowthRecordService;
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
