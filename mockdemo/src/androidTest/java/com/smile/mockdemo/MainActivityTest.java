package com.smile.mockdemo;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by Administrator on 2018/2/26    9:27
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        Intent intent = new Intent(appContext, MainActivity.class);
        appContext.startActivity(intent);
    }

    @After
    public void tearDown() throws Exception {
    }


}