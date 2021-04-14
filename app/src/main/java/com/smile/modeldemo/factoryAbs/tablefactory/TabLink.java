package com.smile.modeldemo.factoryAbs.tablefactory;

import com.smile.modeldemo.factoryAbs.factory.Link;

public class TabLink extends Link {
    public TabLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
