package com.smile.modeldemo;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Administrator on 2018/1/30    17:06
 */

public class CloseUtils {
    private CloseUtils() {
    }

    public static void close(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
