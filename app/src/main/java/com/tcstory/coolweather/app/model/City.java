package com.tcstory.coolweather.app.model;

public class City {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCOde;
    }

    public void setCityCode(String cityCOde) {
        this.cityCOde = cityCOde;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private int id;
    private String cityName;
    private String cityCOde;
    private int provinceId;
}
