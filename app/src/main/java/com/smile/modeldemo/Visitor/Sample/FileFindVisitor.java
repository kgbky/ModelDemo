package com.smile.modeldemo.Visitor.Sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {

    private String suf;
    private List<File> nameList = new ArrayList<>();

    public FileFindVisitor(String suf) {
        this.suf = suf;
    }

    public Iterator getFoundFiles() {
        return nameList.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(suf)) {
            nameList.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
}
