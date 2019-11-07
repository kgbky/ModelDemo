package com.smile.modeldemo.factoryAbs.listfactory;

import com.smile.modeldemo.factoryAbs.factory.Factory;
import com.smile.modeldemo.factoryAbs.factory.Link;
import com.smile.modeldemo.factoryAbs.factory.Page;
import com.smile.modeldemo.factoryAbs.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
