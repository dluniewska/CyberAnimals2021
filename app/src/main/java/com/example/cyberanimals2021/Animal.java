package com.example.cyberanimals2021;

import android.widget.ImageView;

public class Animal {

    private static String tag;

    public Animal(String tag) {
        this.tag = tag;
    }

    static public String getTag() {
        return tag;
    }
}
