package com.example.homegym;

public class WrecItem {
    private int witem_image;
    private String witem_title;

    public WrecItem(int witem_image, String witem_title) {
        this.witem_image = witem_image;
        this.witem_title = witem_title;
    }

    public String getItem_title() {
        return witem_title;
    }
    public int getItem_image() {
        return witem_image;
    }

    public void setItem_title(String witem_title) {
        this.witem_title = witem_title;
    }
    public void setItem_image(int witem_image) {
        this.witem_image = witem_image;
    }
}
