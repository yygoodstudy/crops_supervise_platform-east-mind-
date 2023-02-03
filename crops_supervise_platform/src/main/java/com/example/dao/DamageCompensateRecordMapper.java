package com.example.dao;

import com.example.entity.DamageCompensateRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DamageCompensateRecordMapper {

    // 统计受灾理赔记录表中受灾监管笔数，相同受灾种植户计算一次
    int getCountDamageRecord();

    // 统计受灾理赔记录表中受灾监管养殖户对应受灾亩数总和，重复受灾仅统计一次--待优化
    int getDamageMu();

    // 累计理赔金额
    double getTotalCompensateAmount();

    // 通过客户姓名查询受灾理赔记录
    List<DamageCompensateRecord> listDamageCompensateRecord(String farmerName);
}
