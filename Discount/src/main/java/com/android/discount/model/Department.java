package com.android.discount.model;

public class Department extends UserAbstract {

    private String name;
    private String city;
    private String address;
    private String scheduleWork;
    private String telephones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScheduleWork() {
        return scheduleWork;
    }

    public void setScheduleWork(String scheduleWork) {
        this.scheduleWork = scheduleWork;
    }

    public String getTelephones() {
        return telephones;
    }

    public void setTelephones(String telephones) {
        this.telephones = telephones;
    }
}
