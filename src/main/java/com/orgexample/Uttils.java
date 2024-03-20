package com.orgexample;

public class Uttils {
    private static Fraction ob;

    public Uttils() {
    }

    public Uttils(Fraction ob) {
        this.ob = ob;
    }

    public Fraction getOb() {
        return ob;
    }

    public void setOb(Fraction ob) {
        this.ob = ob;
    }

    public Fractionable cache(Fraction obj){
        System.out.println("before " + this.toString());
        Uttils cacheOb = new Uttils(obj);
        System.out.println("after " + this.toString());
        Fraction ob1 = cacheOb.getOb();
        return ob1;
    }

    @Override
    public String toString() {
        return "Utils{" + "ob=" + ob + '}';
    }

}
