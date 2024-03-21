package com.orgexample;

public class Utils<T extends Fractionable>  {
    private T val;

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
        this.val = arg;
        return (T)this.val;
    }
}
