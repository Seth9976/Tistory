package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

public final class p0 implements Factory {
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        if(!set0.isEmpty()) {
            return null;
        }
        if(type0 == Boolean.TYPE) {
            return s0.b;
        }
        if(type0 == Byte.TYPE) {
            return s0.c;
        }
        if(type0 == Character.TYPE) {
            return s0.d;
        }
        if(type0 == Double.TYPE) {
            return s0.e;
        }
        if(type0 == Float.TYPE) {
            return s0.f;
        }
        if(type0 == Integer.TYPE) {
            return s0.g;
        }
        if(type0 == Long.TYPE) {
            return s0.h;
        }
        if(type0 == Short.TYPE) {
            return s0.i;
        }
        if(type0 == Boolean.class) {
            return s0.b.nullSafe();
        }
        if(type0 == Byte.class) {
            return s0.c.nullSafe();
        }
        if(type0 == Character.class) {
            return s0.d.nullSafe();
        }
        if(type0 == Double.class) {
            return s0.e.nullSafe();
        }
        if(type0 == Float.class) {
            return s0.f.nullSafe();
        }
        if(type0 == Integer.class) {
            return s0.g.nullSafe();
        }
        if(type0 == Long.class) {
            return s0.h.nullSafe();
        }
        if(type0 == Short.class) {
            return s0.i.nullSafe();
        }
        if(type0 == String.class) {
            return s0.j.nullSafe();
        }
        if(type0 == Object.class) {
            return new r0(moshi0).nullSafe();
        }
        Class class0 = Types.getRawType(type0);
        JsonAdapter jsonAdapter0 = Util.generatedAdapter(moshi0, type0, class0);
        if(jsonAdapter0 != null) {
            return jsonAdapter0;
        }
        return class0.isEnum() ? new q0(class0).nullSafe() : null;
    }
}

