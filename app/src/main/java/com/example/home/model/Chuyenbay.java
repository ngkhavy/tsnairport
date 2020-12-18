package com.example.home.model;

public class Chuyenbay {
private int photo;
private String depart;
private String date;
private String go;
private String back;
private String total;
private String stop;
private int explore;
private double price;

    public Chuyenbay(int photo, String depart, String date, String go, String back, String total, String stop, int explore, double price) {
        this.photo = photo;
        this.depart = depart;
        this.date = date;
        this.go = go;
        this.back = back;
        this.total = total;
        this.stop = stop;
        this.explore = explore;
        this.price = price;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGo() {
        return go;
    }

    public void setGo(String go) {
        this.go = go;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public int getExplore() {
        return explore;
    }

    public void setExplore(int explore) {
        this.explore = explore;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
