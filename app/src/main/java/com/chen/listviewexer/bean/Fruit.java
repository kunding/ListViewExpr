package com.chen.listviewexer.bean;

/**
 * Created by arqueen on 2016/7/24.
 */
public class Fruit {
    private String name;
    private int imageId;


    public Fruit(String mName, int mImageId) {
        this.name = mName;
        this.imageId = mImageId;
    }

    public String getmName() {
        return name;
    }

    public void setmName(String mName) {
        this.name = mName;
    }

    public int getmImageId() {
        return imageId;
    }

    public void setmImageId(int mImageId) {
        this.imageId = mImageId;
    }
}
