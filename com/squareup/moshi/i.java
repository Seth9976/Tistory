package com.squareup.moshi;

import g.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

public final class i extends b {
    public final int b;
    public final Class c;
    public final Executable d;

    public i(Executable executable0, Class class0, int v) {
        this.b = v;
        this.d = executable0;
        this.c = class0;
        super();
    }

    @Override  // g.b
    public final Object t() {
        return this.b == 0 ? ((Constructor)this.d).newInstance(null) : ((Method)this.d).invoke(null, this.c, Object.class);
    }

    @Override
    public final String toString() {
        return this.c.getName();
    }
}

