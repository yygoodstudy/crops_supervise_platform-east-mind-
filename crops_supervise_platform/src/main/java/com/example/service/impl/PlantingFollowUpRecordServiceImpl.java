package com.example.service.impl;

import com.example.dao.PlantingFollowUpRecordMapper;
import com.example.entity.PlantingFollowUpRecord;
import com.example.service.PlantingFollowUpRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantingFollowUpRecordServiceImpl implements PlantingFollowUpRecordService {

    @Autowired
    private PlantingFollowUpRecordMapper mapper;

    @Override
    public List<PlantingFollowUpRecord> listPlantingFollowUpRecord(String farmerName) {
        return mapper.listPlantingFollowUpRecord(farmerName);
    }
}
