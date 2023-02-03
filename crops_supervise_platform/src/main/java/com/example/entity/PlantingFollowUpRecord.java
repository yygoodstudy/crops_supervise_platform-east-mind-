package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 种植记录跟进表
 */
public class PlantingFollowUpRecord {

    private Integer id; // 主键
    private String farmerName; // 种植户姓名
    private String phone; // 联系电话
    private String plant; // 种植物确认
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date sowingTime; // 播种时间
    private String wellWater; // 井水
    private String followUpPeople; // 跟进人
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date followUpTime; // 跟进日期

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public void setSowingTime(Date sowingTime) {
        this.sowingTime = sowingTime;
    }

    public void setWellWater(String wellWater) {
        this.wellWater = wellWater;
    }

    public void setFollowUpPeople(String followUpPeople) {
        this.followUpPeople = followUpPeople;
    }

    public void setFollowUpTime(Date followUpTime) {
        this.followUpTime = followUpTime;
    }

    public Integer getId() {
        return id;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getPlant() {
        return plant;
    }

    public Date getSowingTime() {
        return sowingTime;
    }

    public String getWellWater() {
        return wellWater;
    }

    public String getFollowUpPeople() {
        return followUpPeople;
    }

    public Date getFollowUpTime() {
        return followUpTime;
    }
}
