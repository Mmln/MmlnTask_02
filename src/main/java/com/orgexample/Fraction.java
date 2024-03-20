package com.orgexample;

public class Fraction implements Fractionable {
    private int num;
    private int denum;

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
        System.out.println(this.toString() + " invoke double value = " + (double) num/denum);
        return (double) num/denum;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "num=" + num +
                ", denum=" + denum +
                '}';
    }
}
