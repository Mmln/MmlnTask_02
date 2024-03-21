package com.orgexample;

import org.junit.Assert;

import static org.junit.Assert.*;

public class FractionTest {

    @org.junit.Test
    public void setNum() {
        Fraction fr = new Fraction(3,4);
        fr.setNum(4);
        assertEquals((double)fr.doubleValue(),(double)(4.0/4.0),0.0);
    }

    @org.junit.Test
    public void setDenum() {
        Fraction fr = new Fraction(3,4);
        fr.setDenum(3);
        assertEquals((double)fr.doubleValue(),(double)(3.0/3.0),0.0);
    }

    @org.junit.Test
    public void doubleValue() {
        Fraction fr = new Fraction(3,3);
        assertEquals((double)fr.doubleValue(),(double)(3.0/3.0),0.0);
    }

    @org.junit.Test
    public void testToString() {
        Fraction fr = new Fraction(3,3);
        assertNotNull(fr.toString());
    }
}