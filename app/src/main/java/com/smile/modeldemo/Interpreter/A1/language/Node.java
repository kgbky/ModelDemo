package com.smile.modeldemo.Interpreter.A1.language;

public abstract class Node implements Executor {
    public abstract void parse(Context context) throws ParseException;
}
