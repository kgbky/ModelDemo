package com.smile.modeldemo.adapter.exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2018/2/5    13:40
 */

public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        OutputStream outputStream = new FileOutputStream(fileName);
        store(outputStream, "save data");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key, "empty value");
    }

}
