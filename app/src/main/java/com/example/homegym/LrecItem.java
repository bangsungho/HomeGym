package com.example.homegym;

public class LrecItem {
    private int litem_image;
    private String litem_title;

    public LrecItem(int litem_image, String litem_title) {
        this.litem_image = litem_image;
        this.litem_title = litem_title;
    }

    public String getItem_title() {
        return litem_title;
    }
    public int getItem_image() {
        return litem_image;
    }

    public void setItem_title(String litem_title) {
        this.litem_title = litem_title;
    }
    public void setItem_image(int litem_image) {
        this.litem_image = litem_image;
    }
}
