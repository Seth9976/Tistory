package com.squareup.moshi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class t0 implements InvocationHandler {
    public final Class a;

    public t0(Class class0) {
        this.a = class0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        String s = method0.getName();
        s.getClass();
        Class class0 = this.a;
        switch(s) {
            case "annotationType": {
                return class0;
            }
            case "equals": {
                return Boolean.valueOf(class0.isInstance(arr_object[0]));
            }
            case "hashCode": {
                return 0;
            }
            case "toString": {
                return "@" + class0.getName() + "()";
            }
            default: {
                return method0.invoke(object0, arr_object);
            }
        }
    }
}

