package com.smile.modeldemo.add;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2018/2/12    15:27
 */
public class AddImpTest extends TestCase {

    Adder adder;

    @Before
    public void setUp() throws Exception {
        adder = new AddImp();
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        adder = null;
        super.tearDown();
    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(0, adder.add(0, 0));
        assertEquals(2, adder.add(1, 1));
        assertEquals(10, adder.add(8, 2));
        assertEquals(Integer.MAX_VALUE + 1, adder.add(1, Integer.MAX_VALUE));
        assertFalse(1 == 2);
    }

    public void test2() {
        System.out.println("test2");
    }

}