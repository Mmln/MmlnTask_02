package com.orgexample;

import java.lang.reflect.Proxy;

public class Fraction implements Fractionable {
    private int num;
    private int denum;
    private double dval;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Mutator
    public void setNum(int num) {
        this.num = num;
    }

    @Mutator
    public void setDenum(int denum) {
        this.denum = denum;
    }

    @Override
    @Cache
    public double doubleValue() {
        System.out.print("doubleValue called, now cached = " + FractionableInvHandler.isCached() + ", then ");
        if(FractionableInvHandler.isCached() == 1 ) {
            System.out.println("value taken from cache = " + String.format("%.2f", dval) + " " + this.toString());
            return dval;
        }
        System.out.println("value calculated by doubleValue = " + String.format("%.2f",(double) num/denum) + " " + this.toString());
        dval = (double) num/denum;
        return dval;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", denum=" + denum +
                '}';
    }

    public  Object getProxy()
    {
        Class cls = this.getClass();
        return  Proxy.newProxyInstance(cls.getClassLoader(),
                new Class[]{Fractionable.class},
                new FractionableInvHandler(this));
    }


}
