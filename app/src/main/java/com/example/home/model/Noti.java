package com.example.home.model;

public class Noti {
    private String title;
    private String caption;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Noti(){

    }

    public Noti(String title, String caption) {
        this.title = title;
        this.caption = caption;
    }
}
