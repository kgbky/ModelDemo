package com.smile.modeldemo.factoryAbs.tablefactory;

import com.smile.modeldemo.factoryAbs.factory.Page;

class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
