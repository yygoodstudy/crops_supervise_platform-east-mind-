package com.example.crops_supervise_platform.service.impl;

import com.example.crops_supervise_platform.entity.NumberDTO;
import com.example.crops_supervise_platform.service.CustomerBasicInformationService;
import com.example.crops_supervise_platform.service.DamageCompensateRecordService;
import com.example.crops_supervise_platform.service.NavigationDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavigationDataServiceImpl implements NavigationDataService {
    @Autowired
    private CustomerBasicInformationService informationService;
    @Autowired
    private DamageCompensateRecordService damageCompensateRecordService;

    @Override
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
}
