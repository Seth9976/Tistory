package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

public final class w1 implements Comparable, Map.Entry {
    public final Comparable a;
    public Object b;
    public final t1 c;

    public w1(t1 t10, Comparable comparable0, Object object0) {
        this.c = t10;
        this.a = comparable0;
        this.b = object0;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a.compareTo(((w1)object0).a);
    }

    @Override
    public final boolean equals(Object object0) {
        boolean z;
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof Map.Entry)) {
            return false;
        }
        Object object1 = ((Map.Entry)object0).getKey();
        Comparable comparable0 = this.a;
        if(comparable0 != null) {
            z = comparable0.equals(object1);
        }
        else if(object1 != null) {
            z = false;
        }
        else {
            z = true;
        }
        if(z) {
            Object object2 = this.b;
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == null ? object3 == null : object2.equals(object3);
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.a;
    }

    @Override
    public final Object getValue() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Object object0 = this.b;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final Object setValue(Object object0) {
        this.c.e();
        Object object1 = this.b;
        this.b = object0;
        return object1;
    }

    @Override
    public final String toString() {
        return this.a + "=" + this.b;
    }
}

