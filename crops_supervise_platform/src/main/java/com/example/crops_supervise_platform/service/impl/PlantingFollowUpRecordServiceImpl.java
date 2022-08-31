package com.example.crops_supervise_platform.service.impl;

import com.example.crops_supervise_platform.dao.PlantingFollowUpRecordMapper;
import com.example.crops_supervise_platform.entity.PlantingFollowUpRecord;
import com.example.crops_supervise_platform.service.PlantingFollowUpRecordService;
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
