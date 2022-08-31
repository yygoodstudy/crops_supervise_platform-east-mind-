package com.example.crops_supervise_platform.controller;

import com.example.crops_supervise_platform.entity.CustomerBasicInformation;
import com.example.crops_supervise_platform.entity.NumberDTO;
import com.example.crops_supervise_platform.service.CustomerBasicInformationService;
import com.example.crops_supervise_platform.service.DamageCompensateRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/customer")
public class CustomerBasicInformationController {
    @Autowired
    private CustomerBasicInformationService informationService;
    @Autowired
    private DamageCompensateRecordService damageCompensateRecordService;

    @GetMapping("/count")
    public NumberDTO count() {
        // 已交货监管笔数
        Integer deliveryCount = informationService.getCountByDeliveryState("已交货");
        // 交货数量
        Double deliveryQuantity = informationService.getDeliveryQuantity("已交货");
        // 已还款金额
        Double repaidMoney = informationService.getAmountByDeliveryState("已交货");
        // 累计监管笔数
        int countRegulatoryStatus = informationService.countByRegulatoryStatusInt();
        // 累计监管亩数
        int sumCultivatedMus = informationService.sumCultivatedMus();

        // 未交货监管笔数
        Integer noDeliveryCount = informationService.getCountByDeliveryState("未交货");
        // 应收贷款金额
        Double noRepaidAmount = informationService.getNoRepaidAmount();
        noRepaidAmount = Double.valueOf(String.format("%.2f", noRepaidAmount)); // 保留两位小数并四舍五入

        // 受灾监管笔数
        int countDamageRecord = damageCompensateRecordService.getCountDamageRecord();
        // 受灾亩数
        int damageMu = damageCompensateRecordService.getDamageMu();
        // 累计理赔金额
        double totalCompensateAmount = damageCompensateRecordService.getTotalCompensateAmount();

        NumberDTO numberDTO = new NumberDTO();
        numberDTO.setRepaidAmount(repaidMoney);
        numberDTO.setDeliveryQuantity(deliveryQuantity);
        numberDTO.setDeliveryCount(deliveryCount);
        numberDTO.setNoDeliveryCount(noDeliveryCount);
        numberDTO.setNoRepaidAmount(noRepaidAmount);
        numberDTO.setDamageCount(countDamageRecord);
        numberDTO.setDamageMu(damageMu);
        numberDTO.setTotalCompensateAmount(totalCompensateAmount);
        numberDTO.setCountRegulatoryStatus(countRegulatoryStatus);
        numberDTO.setSumCultivatedMus(sumCultivatedMus);
        return numberDTO;
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
    public List<String> listByBank(){
        return informationService.listByBank();
    }
}
