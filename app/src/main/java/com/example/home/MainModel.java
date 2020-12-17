package com.example.home;

public class MainModel {
    Integer popularImg;
    String popularName;

    public MainModel(Integer popularImg, String popularName){
        this.popularImg=popularImg;
        this.popularName=popularName;
    }

    public Integer getPopularImg() {
        return popularImg;
    }

    public String getPopularName() {
        return popularName;
    }
}
