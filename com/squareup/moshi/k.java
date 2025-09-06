package com.squareup.moshi;

import g.b;
import java.lang.reflect.Method;

public final class k extends b {
    public final Method b;
    public final Class c;
    public final int d;

    public k(Method method0, Class class0, int v) {
        this.b = method0;
        this.c = class0;
        this.d = v;
    }

    @Override  // g.b
    public final Object t() {
        return this.b.invoke(null, this.c, this.d);
    }

    @Override
    public final String toString() {
        return this.c.getName();
    }
}

