package com.example.crops_supervise_platform.dao;

import com.example.crops_supervise_platform.entity.CustomerBasicInformation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerBasicInformationMapper {

    // 统计已交货或者未交货的监管笔数
    Integer getCountByDeliveryState(String state);

    // 统计已交货或未交货的监管笔数对应的交货数量
    Double getDeliveryQuantity(String state);

    // 统计已交货的已还款金额
    Double getAmountByDeliveryState(String state);

    // 统计未交货的应收贷款金额
    Double getNoRepaidAmount();

    // 通过条件查询所有监管客户的基础信息
    List<CustomerBasicInformation> listCustomerBasicInformation(@Param("regulatoryStatus") String regulatoryStatus,
                                                                @Param("deliveryState") String deliveryState,
                                                                @Param("farmerName") String farmerName,
                                                                @Param("bank") String bank,
                                                                @Param("damageStatus") String damageStatus);

    // 通过姓名查询具体的监管客户基础信息(左侧点击顾客姓名，按照姓名进行查询)
    List<CustomerBasicInformation> findCustomerInfoByName(String farmerName);

    // 统计累计监管笔数
    int countByRegulatoryStatusInt();

    // 统计累计监管亩数
    int sumCultivatedMus();

    // 获取银行列表
    List<String> listByBank();
}
