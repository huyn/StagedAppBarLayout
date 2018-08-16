package com.example.brian.appbarlayoutdemo;

/**
 * Created by brian on 2018/8/16.
 */

public class DummyItem {

    public final String id;
    public final String content;
    public final String details;

    public DummyItem(String id, String content, String details) {
        this.id = id;
        this.content = content;
        this.details = details;
    }

    @Override
    public String toString() {
        return content;
    }

}
