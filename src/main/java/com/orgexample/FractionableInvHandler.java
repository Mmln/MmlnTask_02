package com.orgexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class FractionableInvHandler implements InvocationHandler {

    private Object obj;
    FractionableInvHandler(Object obj){this.obj = obj;}
    private static int cached = -1;

    public static int isCached() {
        return cached;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Method m = obj.getClass().getMethod(method.getName(), method.getParameterTypes());

        Annotation[] anns = m.getDeclaredAnnotations();

        if (Arrays.stream(anns).filter(x->((Annotation)x).annotationType().equals(Mutator.class)).count()>0){
            cached = -1;
            System.out.println("Mutator set cache to null, now cached=" + cached);
        }

        if (Arrays.stream(anns).filter(x->((Annotation)x).annotationType().equals(Cache.class)).count()>0) {
            if(cached == 0){
                cached = 1;
            } else if(cached < 0){
                cached = 0;
            }
        }
        return method.invoke(obj, args);
    }
}
