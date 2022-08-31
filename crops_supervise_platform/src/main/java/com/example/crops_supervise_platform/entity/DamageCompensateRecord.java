package com.example.crops_supervise_platform.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 受灾理赔记录
 */
public class DamageCompensateRecord {
    private Integer id; // 主键
    private String farmerName; // 种植户姓名
    private String phone; // 联系电话
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date damageDate; // 受灾日期
    private String damageType; // 受灾类型
    private String damageMu; // 受灾亩数
    private Character ifCompensate; // 是否理赔
    private Double compensateAmount; // 理赔金额(万)
    private String followUpPeople; // 跟进人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDamageDate() {
        return damageDate;
    }

    public void setDamageDate(Date damageDate) {
        this.damageDate = damageDate;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDamageMu() {
        return damageMu;
    }

    public void setDamageMu(String damageMu) {
        this.damageMu = damageMu;
    }

    public Character getIfCompensate() {
        return ifCompensate;
    }

    public void setIfCompensate(Character ifCompensate) {
        this.ifCompensate = ifCompensate;
    }

    public Double getCompensateAmount() {
        return compensateAmount;
    }

    public void setCompensateAmount(Double compensateAmount) {
        this.compensateAmount = compensateAmount;
    }

    public String getFollowUpPeople() {
        return followUpPeople;
    }

    public void setFollowUpPeople(String followUpPeople) {
        this.followUpPeople = followUpPeople;
    }
}
