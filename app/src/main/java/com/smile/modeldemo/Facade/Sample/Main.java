package com.smile.modeldemo.Facade.Sample;


import com.smile.modeldemo.Facade.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        //PageMaker 是Facade角色
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
