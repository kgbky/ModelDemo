package com.smile.modeldemo.factoryAbs.tablefactory;

import com.smile.modeldemo.factoryAbs.factory.Factory;
import com.smile.modeldemo.factoryAbs.factory.Link;
import com.smile.modeldemo.factoryAbs.factory.Page;
import com.smile.modeldemo.factoryAbs.factory.Tray;

/**
 * 具体的工厂，网页内容显示为表格
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TabLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
