package com.example.practice.demo.model;

import java.util.List;

public class Port {
    private String name;
    private String city;
    private String country;
    private List<String> alias;
    private List<String> regions;
    private List<Double> coordinates;
    private String province;
    private String timezone;
    private List<String> unlocs;
    private String code;

    public Port() {
    }

    public Port(String name, String city, String country, List<String> alias, List<String> regions, List<Double> coordinates, String province, String timezone, List<String> unlocs, String code) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.alias = alias;
        this.regions = regions;
        this.coordinates = coordinates;
        this.province = province;
        this.timezone = timezone;
        this.unlocs = unlocs;
        this.code = code;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<String> getUnlocs() {
        return unlocs;
    }

    public void setUnlocs(List<String> unlocs) {
        this.unlocs = unlocs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
