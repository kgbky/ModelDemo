package com.smile.modeldemo.prototype;

import junit.framework.TestCase;

import org.junit.Test;

public class GoodsTest extends TestCase {

    @Test
    public void testGoods() throws Exception {
        Goods gs = new Goods();
        gs.price = 12;
        Owner owner = new Owner();
        owner.name = "owner";
        owner.age = 88;
        gs.owner = owner;

        Object gsCopy = gs.clone();
        assertTrue(gs != gsCopy);
        assertTrue(gs.getClass() == gsCopy.getClass());
        assertFalse(gs.equals(gsCopy));

        assertFalse(gs.owner == ((Goods) gsCopy).owner);
    }

}
