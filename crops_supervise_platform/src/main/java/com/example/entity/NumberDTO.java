package com.example.entity;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class NumberDTO {
    private Integer deliveryCount; // 已交货监管笔数
    private Double deliveryQuantity; // 交货数量
    private Double repaidAmount; // 已还款金额
    private Integer noDeliveryCount; // 未交货监管笔数
    private Double noRepaidAmount; // 应收贷款金额
    private Integer damageCount; // 受灾监管笔数
    private Integer damageMu; // 受灾亩数
    private Double totalCompensateAmount; // 累计理赔金额
    private Integer countRegulatoryStatus; // 累计监管笔数
    private Integer sumCultivatedMus; // 累计监管亩数

    public Integer getDeliveryCount() {
        return deliveryCount;
    }

    public void setDeliveryCount(Integer deliveryCount) {
        this.deliveryCount = deliveryCount;
    }

    public Double getDeliveryQuantity() {
        return deliveryQuantity;
    }

    public void setDeliveryQuantity(Double deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }

    public Double getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(Double repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public Integer getNoDeliveryCount() {
        return noDeliveryCount;
    }

    public void setNoDeliveryCount(Integer noDeliveryCount) {
        this.noDeliveryCount = noDeliveryCount;
    }

    public Double getNoRepaidAmount() {
        return noRepaidAmount;
    }

    public void setNoRepaidAmount(Double noRepaidAmount) {
        this.noRepaidAmount = noRepaidAmount;
    }

    public Integer getDamageCount() {
        return damageCount;
    }

    public void setDamageCount(Integer damageCount) {
        this.damageCount = damageCount;
    }

    public Integer getDamageMu() {
        return damageMu;
    }

    public void setDamageMu(Integer damageMu) {
        this.damageMu = damageMu;
    }

    public Double getTotalCompensateAmount() {
        return totalCompensateAmount;
    }

    public void setTotalCompensateAmount(Double totalCompensateAmount) {
        this.totalCompensateAmount = totalCompensateAmount;
    }

    public Integer getCountRegulatoryStatus() {
        return countRegulatoryStatus;
    }

    public void setCountRegulatoryStatus(Integer countRegulatoryStatus) {
        this.countRegulatoryStatus = countRegulatoryStatus;
    }

    public Integer getSumCultivatedMus() {
        return sumCultivatedMus;
    }

    public void setSumCultivatedMus(Integer sumCultivatedMus) {
        this.sumCultivatedMus = sumCultivatedMus;
    }
}
