package com.example.service.impl;

import com.example.dao.CustomerBasicInformationMapper;
import com.example.entity.CustomerBasicInformation;
import com.example.service.CustomerBasicInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 监管客户基础信息service
 */
@Service
public class CustomerBasicInformationServiceImpl implements CustomerBasicInformationService {

    @Autowired
    private CustomerBasicInformationMapper mapper;

    @Override
    public Integer getCountByDeliveryState(String state) {
        return mapper.getCountByDeliveryState(state);
    }

    @Override
    public Double getDeliveryQuantity(String state) {
        return mapper.getDeliveryQuantity(state);
    }

    @Override
    public Double getAmountByDeliveryState(String state) {
        return mapper.getAmountByDeliveryState(state);
    }

    @Override
    public Double getNoRepaidAmount() {
        return mapper.getNoRepaidAmount();
    }

    @Override
    public List<CustomerBasicInformation> listCustomerBasicInformation(String regulatoryStatus, String deliveryState, String farmerName, String bank, String damageStatus) {
        return mapper.listCustomerBasicInformation(regulatoryStatus, deliveryState, farmerName, bank, damageStatus);
    }

    @Override
    public List<CustomerBasicInformation> findCustomerInfoByName(String farmerName) {
        return mapper.findCustomerInfoByName(farmerName);
    }

    @Override
    public int countByRegulatoryStatusInt() {
        return mapper.countByRegulatoryStatusInt();
    }

    @Override
    public int sumCultivatedMus() {
        return mapper.sumCultivatedMus();
    }

    @Override
    public List<String> listByBank() {
        return mapper.listByBank();
    }
}
