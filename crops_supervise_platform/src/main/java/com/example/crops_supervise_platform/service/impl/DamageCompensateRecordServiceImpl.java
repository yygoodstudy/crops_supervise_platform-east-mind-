package com.example.crops_supervise_platform.service.impl;

import com.example.crops_supervise_platform.dao.DamageCompensateRecordMapper;
import com.example.crops_supervise_platform.entity.DamageCompensateRecord;
import com.example.crops_supervise_platform.service.DamageCompensateRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 受灾理赔记录service
 */
@Service
public class DamageCompensateRecordServiceImpl implements DamageCompensateRecordService {

    @Autowired
    private DamageCompensateRecordMapper mapper;

    @Override
    public int getCountDamageRecord() {
        return mapper.getCountDamageRecord();
    }

    @Override
    public int getDamageMu() {
        return mapper.getDamageMu();
    }

    @Override
    public double getTotalCompensateAmount() {
        return mapper.getTotalCompensateAmount();
    }

    @Override
    public List<DamageCompensateRecord> listDamageCompensateRecord(String farmerName) {
        return mapper.listDamageCompensateRecord(farmerName);
    }
}
