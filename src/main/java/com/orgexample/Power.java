package com.orgexample;

public class Power implements Fractionable {
    private int num;
    private int denum;

    public Power(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Mutator
    public void setNum(int num) {
        this.num = num;
        System.out.print(" " + this + " ");
    }

    @Mutator
    public void setDenum(int denum) {
        this.denum = denum;
        System.out.print(" " + this + " ");
    }

    @Cache
    @Override
    public double doubleValue() {
        System.out.print(" " + this + " ");
        return (double) Math.pow(num, denum);
    }

    @Override
    public String toString() {
        return "Power{" +
                "num=" + num +
                ", denum=" + denum +
                '}';
    }
}
