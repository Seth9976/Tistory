package com.google.gson.internal;

import java.lang.reflect.Method;

public final class s extends UnsafeAllocator {
    public final Method a;
    public final int b;

    public s(Method method0, int v) {
        this.a = method0;
        this.b = v;
        super();
    }

    @Override  // com.google.gson.internal.UnsafeAllocator
    public final Object newInstance(Class class0) {
        String s = ConstructorConstructor.a(class0);
        if(s != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + s);
        }
        return this.a.invoke(null, class0, this.b);
    }
}

