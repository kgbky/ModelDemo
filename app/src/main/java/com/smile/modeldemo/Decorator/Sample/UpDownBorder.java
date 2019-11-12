package com.smile.modeldemo.Decorator.Sample;

public class UpDownBorder extends Border {

    private char aChar;

    protected UpDownBorder(Display display, char aChar) {
        super(display);
        this.aChar = aChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return getString();
        } else if (row == display.getRows() + 1) {
            return getString();
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String getString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < display.getColumns(); i++) {
            buffer.append(aChar);
        }
        return buffer.toString();
    }

}
