package com.smile.modeldemo.builder;

public class TextBuilder implements Builder {

    private StringBuilder builder = new StringBuilder();

    public String getResult() {
        return builder.toString();
    }

    @Override
    public void makeTitle(String title) {
        builder.append("================================\n");
        builder.append("[").append(title).append("]\n");
        builder.append("\n");
    }

    @Override
    public void makeString(String str) {
        builder.append("////").append(str).append("\n");
        builder.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String str :
                items) {
            builder.append("::::").append(str).append("\n");
        }
        builder.append("\n");
    }

    @Override
    public void close() {
        builder.append("================================\n");
    }
}
