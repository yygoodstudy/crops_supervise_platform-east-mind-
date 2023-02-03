package com.example.controller;

import com.example.entity.CustomerBasicInformation;
import com.example.entity.NumberDTO;
import com.example.service.CustomerBasicInformationService;
import com.example.service.NavigationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerBasicInformationController {
    @Autowired
    private CustomerBasicInformationService informationService;

    @Autowired
    private NavigationDataService navigationDataService;

    /**
     * 银行大屏导航数据计算
     */
    @GetMapping("/count")
    public NumberDTO count() {
        return navigationDataService.count();
    }

    /**
     * 左侧点击客户姓名查询客户详细信息
     *
     * @param farmerName 客户姓名
     * @return 监管客户基础信息
     */
    @GetMapping("/findCustomerInfoByName")
    public List<CustomerBasicInformation> findCustomerInfoByName(String farmerName) {
        return informationService.findCustomerInfoByName(farmerName);
    }


    /**
     * 左侧监管客户基础信息条件查询
     */
    @GetMapping("/listCustomerBasicInformation")
    public List<CustomerBasicInformation> listCustomerBasicInformation(String regulatoryStatus, String deliveryState, String farmerName, String bank, Integer damageCode) {
        // damageCode: 0:全部，1：受灾,2：未受灾
        String damageStatus = null;
        if (damageCode != null) {
            if (damageCode == 0) {
                damageStatus = "全部";
            } else if (damageCode == 1) {
                damageStatus = "受灾";
            } else if (damageCode == 2) {
                damageStatus = "未受灾";
            }
        } else {
            damageStatus = "全部";
        }
        return informationService.listCustomerBasicInformation(regulatoryStatus, deliveryState, farmerName, bank, damageStatus);
    }

    @GetMapping("bankList")
    public List<String> listByBank() {
        return informationService.listByBank();
    }
}
