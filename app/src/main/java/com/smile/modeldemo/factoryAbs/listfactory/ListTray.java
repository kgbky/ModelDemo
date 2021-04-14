package com.smile.modeldemo.factoryAbs.listfactory;

import com.smile.modeldemo.factoryAbs.factory.Item;
import com.smile.modeldemo.factoryAbs.factory.Tray;

/**
 * 具体的零件
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        //这里不要判断item具体是那种类型，否则就是非面向对象编程
        for (Item item :
                list) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
