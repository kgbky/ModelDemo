package com.smile.modeldemo.Interpreter.Sample;

import java.io.BufferedReader;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {
            String p = "program end\n" +
                    "program go end\n" +
                    "program go right go right go right go right end\n" +
                    "program repeat 4 go right end end\n" +
                    "program repeat 4 repeat 3 go right go left end right end end";

            BufferedReader reader = new BufferedReader(new StringReader(p));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
