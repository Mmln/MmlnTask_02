package com.orgexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Utils<T>  implements InvocationHandler {
    private T val;

    public Utils(T obj) {
        this.val = obj;
    }

    public static <T> T cache(T arg){
        return (T) Proxy.newProxyInstance(arg.getClass().getClassLoader(),
                arg.getClass().getInterfaces(),
                new Utils<>(arg));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method m = val.getClass().getMethod(method.getName(), method.getParameterTypes());

        Annotation[] anns = m.getDeclaredAnnotations();

        if (Arrays.stream(anns).filter(x->((Annotation)x).annotationType().equals(Mutator.class)).count()>0){
            System.out.print("Mutator called");
        }

        if (Arrays.stream(anns).filter(x->((Annotation)x).annotationType().equals(Cache.class)).count()>0) {
            System.out.print("Cache called");
        }
        return method.invoke(val, args);
    }
}
