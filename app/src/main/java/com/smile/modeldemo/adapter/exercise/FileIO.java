package com.smile.modeldemo.adapter.exercise;

import java.io.IOException;

/**
 * Created by Administrator on 2018/2/5    13:38
 */

public interface FileIO {

    void readFromFile(String fileName) throws IOException;

    void writeToFile(String fileName) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
