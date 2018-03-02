package com.smile.mockdemo;

import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/2/24    15:55
 */
@RunWith(AndroidJUnit4.class)
public class MathUtilsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        assertEquals(0, MathUtils.add(0, 0));
        assertEquals(0, MathUtils.add(1, -1));
        assertEquals(1, MathUtils.add(1, 0));
        assertEquals(2, MathUtils.add(1, 1));
        assertEquals(Integer.MAX_VALUE + 1, MathUtils.add(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE - 1, MathUtils.add(Integer.MIN_VALUE, -1));
    }

}