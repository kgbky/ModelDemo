package com.smile.modeldemo.Visitor.Sample;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}