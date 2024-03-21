package com.orgexample;

public class Utils<T extends Fractionable>  {
    private T val;

    public Utils() {
    }

    public T cache(T arg){
        this.val = arg;
        return (T)this.val;
    }
}
