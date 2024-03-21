package com.orgexample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void cache() {
        Object fr;
        fr = new Fraction(3,3);
        Fractionable num = new Utils().cache((Fractionable)fr);
        Assert.assertEquals(num.doubleValue(),(double)(3/3),0);
    }
}