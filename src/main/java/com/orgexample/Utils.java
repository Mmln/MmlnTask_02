package com.orgexample;

public class Utils<T extends Fractionable>  {
    protected T val;

    public Utils() {
    }

    public Utils(T arg){
        this.val = arg;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public T cache(T arg){

        if (this.val == null)
            System.out.println("before this.val is null");
        else
            System.out.println("before " + this.val.toString());

        this.val = arg;
        System.out.println("after " + this.val.toString());
        return (T)this.val;
    }
}
