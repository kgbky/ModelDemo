package com.smile.modeldemo.builder;

public class HTMLBuilder implements Builder {
    private String fileName;


    public String getResult() {
        return fileName;
    }

    @Override
    public void makeTitle(String title) {

    }

    @Override
    public void makeString(String str) {

    }

    @Override
    public void makeItems(String[] items) {

    }

    @Override
    public void close() {

    }
}
