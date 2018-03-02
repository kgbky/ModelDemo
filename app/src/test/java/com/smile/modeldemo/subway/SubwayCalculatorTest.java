package com.smile.modeldemo.subway;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2018/2/23    10:02
 */
public class SubwayCalculatorTest extends TestCase {
    @Before
    public void setUp() throws Exception {
        System.out.println("setUP");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test
    public void testSubwayPrice() throws Exception {
        //边界条件
        assertEquals(0, SubwayCalculator.subwayPrice(-1));
        assertEquals(0, SubwayCalculator.subwayPrice(0));

        //<=6公里 3块
        assertEquals(3, SubwayCalculator.subwayPrice(1));
        assertEquals(3, SubwayCalculator.subwayPrice(5));
        assertEquals(3, SubwayCalculator.subwayPrice(6));

        //<=12公里 4块
        assertEquals(4, SubwayCalculator.subwayPrice(7));
        assertEquals(4, SubwayCalculator.subwayPrice(11));
        assertEquals(4, SubwayCalculator.subwayPrice(12));

        //<=22公里 5块
        assertEquals(5, SubwayCalculator.subwayPrice(13));
        assertEquals(5, SubwayCalculator.subwayPrice(16));
        assertEquals(5, SubwayCalculator.subwayPrice(22));

        //<=32公里 6块
        assertEquals(6, SubwayCalculator.subwayPrice(23));
        assertEquals(6, SubwayCalculator.subwayPrice(26));
        assertEquals(6, SubwayCalculator.subwayPrice(32));

        //>32公里 5块
        assertEquals(7, SubwayCalculator.subwayPrice(33));
        assertEquals(7, SubwayCalculator.subwayPrice(100));
    }

}