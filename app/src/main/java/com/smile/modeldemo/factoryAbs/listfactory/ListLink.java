package com.smile.modeldemo.factoryAbs.listfactory;

import com.smile.modeldemo.factoryAbs.factory.Link;

/**
 * 具体的零件
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
