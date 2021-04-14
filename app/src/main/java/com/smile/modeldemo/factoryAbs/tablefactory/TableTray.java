package com.smile.modeldemo.factoryAbs.tablefactory;

import com.smile.modeldemo.factoryAbs.factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
