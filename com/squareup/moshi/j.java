package com.squareup.moshi;

import g.b;
import java.lang.reflect.Method;

public final class j extends b {
    public final Method b;
    public final Object c;
    public final Class d;

    public j(Method method0, Object object0, Class class0) {
        this.b = method0;
        this.c = object0;
        this.d = class0;
    }

    @Override  // g.b
    public final Object t() {
        return this.b.invoke(this.c, this.d);
    }

    @Override
    public final String toString() {
        return this.d.getName();
    }
}

