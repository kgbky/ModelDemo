package com.smile.modeldemo.factoryAbs.listfactory;

import com.smile.modeldemo.factoryAbs.factory.Item;
import com.smile.modeldemo.factoryAbs.factory.Page;

/**
 * 具体的产品
 */
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<hl>").append(title).append("</hl>\n");
        buffer.append("<ul>\n");
        for (Item item :
                list) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }

}
