package com.smile.modeldemo.Decorator.Sample;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private int columns;
    private List<String> list = new ArrayList<>();

    public void add(String str) {
        list.add(str);
        if (columns < str.length()) {
            columns = str.length();
        }
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        String str = list.get(row);
        StringBuilder buffer = new StringBuilder(str);
        if (str.length() < columns) {
            int i = columns - str.length();
            for (int j = 0; j < i; j++) {
                buffer.append(" ");
            }
        }
        return buffer.toString();
    }
}
