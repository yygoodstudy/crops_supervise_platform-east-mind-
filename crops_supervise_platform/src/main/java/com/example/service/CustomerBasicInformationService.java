package com.example.service;

import com.example.entity.CustomerBasicInformation;

import java.util.List;

public interface CustomerBasicInformationService {
    // 统计已交货或者未交货的监管笔数
    Integer getCountByDeliveryState(String state);

    // 统计已交货或未交货的监管笔数对应的交货数量
    Double getDeliveryQuantity(String state);

    // 统计已交货的已还款金额
    Double getAmountByDeliveryState(String state);

    // 统计未交货的应收贷款金额
    Double getNoRepaidAmount();

    // 查询所有监管客户的基础信息
    List<CustomerBasicInformation> listCustomerBasicInformation(String regulatoryStatus, String deliveryState,
                                                                String farmerName, String bank, String damageStatus);

    // 通过姓名查询具体的监管客户基础信息(左侧点击顾客姓名，按照姓名进行查询)
    List<CustomerBasicInformation> findCustomerInfoByName(String farmerName);

    // 统计累计监管笔数
    int countByRegulatoryStatusInt();

    // 统计累计监管亩数
    int sumCultivatedMus();

    // 获取银行列表
    List<String> listByBank();
}
