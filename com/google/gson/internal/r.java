package com.google.gson.internal;

import java.lang.reflect.Method;

public final class r extends UnsafeAllocator {
    public final Method a;
    public final Object b;

    public r(Method method0, Object object0) {
        this.a = method0;
        this.b = object0;
        super();
    }

    @Override  // com.google.gson.internal.UnsafeAllocator
    public final Object newInstance(Class class0) {
        String s = ConstructorConstructor.a(class0);
        if(s != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + s);
        }
        return this.a.invoke(this.b, class0);
    }
}

