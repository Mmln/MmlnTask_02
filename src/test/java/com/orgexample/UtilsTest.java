package com.orgexample;

import org.junit.Assert;
import org.junit.Test;

public class UtilsTest {

    @Test
    public void cache() {
        Fraction fr = new Fraction(3,3);
        Fractionable num = Utils.cache(fr);
        Assert.assertEquals(num.doubleValue(),(3/3),0);
    }
}