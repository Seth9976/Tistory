package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

public final class d implements ObjectConstructor {
    public final int a;
    public final InstanceCreator b;
    public final Type c;

    public d(InstanceCreator instanceCreator0, Type type0, int v) {
        this.a = v;
        this.b = instanceCreator0;
        this.c = type0;
        super();
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        return this.b.createInstance(this.c);
    }
}

