package com.squareup.moshi;

import java.util.Map.Entry;

public final class f0 implements Map.Entry {
    public f0 a;
    public f0 b;
    public f0 c;
    public f0 d;
    public f0 e;
    public final Object f;
    public final int g;
    public Object h;
    public int i;

    public f0() {
        this.f = null;
        this.g = -1;
        this.e = this;
        this.d = this;
    }

    public f0(f0 f00, Object object0, int v, f0 f01, f0 f02) {
        this.a = f00;
        this.f = object0;
        this.g = v;
        this.i = 1;
        this.d = f01;
        this.e = f02;
        f02.d = this;
        f01.e = this;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map.Entry) {
            Object object1 = this.f;
            if(object1 == null) {
                if(((Map.Entry)object0).getKey() == null) {
                    return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
                }
            }
            else if(object1.equals(((Map.Entry)object0).getKey())) {
                return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
            }
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f;
    }

    @Override
    public final Object getValue() {
        return this.h;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.f == null ? 0 : this.f.hashCode();
        Object object0 = this.h;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        Object object1 = this.h;
        this.h = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.f + "=" + this.h;
    }
}

