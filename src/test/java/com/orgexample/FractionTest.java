package com.orgexample;

import static org.junit.Assert.*;

public class FractionTest {

    @org.junit.Test
    public void setNum() {
        Fraction fr = new Fraction(3,4);
        fr.setNum(4);
        assertEquals(fr.doubleValue(),(4.0/4.0),0.0);
    }

    @org.junit.Test
    public void setDenum() {
        Fraction fr = new Fraction(3,4);
        fr.setDenum(3);
        assertEquals(fr.doubleValue(),(3.0/3.0),0.0);
    }

    @org.junit.Test
    public void doublValue() {
        Fraction fr = new Fraction(3,3);
        assertEquals(fr.doubleValue(),(3.0/3.0),0.0);
    }

    @org.junit.Test
    public void testToString() {
        Fraction fr = new Fraction(3,3);
        assertNotNull(fr.toString());
    }
}