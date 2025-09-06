package com.google.gson.internal;

import java.util.Map.Entry;

public final class m implements Map.Entry {
    public m a;
    public m b;
    public m c;
    public m d;
    public m e;
    public final Object f;
    public final boolean g;
    public Object h;
    public int i;

    public m(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }

    public m(boolean z, m m0, Object object0, m m1, m m2) {
        this.a = m0;
        this.f = object0;
        this.g = z;
        this.i = 1;
        this.d = m1;
        this.e = m2;
        m2.d = this;
        m1.e = this;
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
        if(object0 == null && !this.g) {
            throw new NullPointerException("value == null");
        }
        Object object1 = this.h;
        this.h = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.f + "=" + this.h;
    }
}

