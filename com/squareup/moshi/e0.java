package com.squareup.moshi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

public final class e0 extends AbstractSet {
    public final int a;
    public final g0 b;

    public e0(g0 g00, int v) {
        this.a = v;
        this.b = g00;
        super();
    }

    @Override
    public final void clear() {
        if(this.a != 0) {
            this.b.clear();
            return;
        }
        this.b.clear();
    }

    @Override
    public final boolean contains(Object object0) {
        if(this.a != 0) {
            return this.b.containsKey(object0);
        }
        if(object0 instanceof Map.Entry) {
            g0 g00 = this.b;
            g00.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            f0 f00 = null;
            f0 f01 = null;
            if(object1 != null) {
                try {
                    f01 = g00.a(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(f01 != null) {
                Object object2 = f01.h;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    f00 = f01;
                }
            }
            return f00 != null;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.a == 0 ? new d0(this.b, 0) : new d0(this.b, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        boolean z = false;
        if(this.a != 0) {
            g0 g00 = this.b;
            g00.getClass();
            f0 f00 = null;
            if(object0 != null) {
                try {
                    f00 = g00.a(object0, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(f00 != null) {
                g00.c(f00, true);
            }
            return f00 != null;
        }
        if(object0 instanceof Map.Entry) {
            g0 g01 = this.b;
            g01.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            f0 f01 = null;
            f0 f02 = null;
            if(object1 != null) {
                try {
                    f02 = g01.a(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(f02 != null) {
                Object object2 = f02.h;
                Object object3 = ((Map.Entry)object0).getValue();
                if(object2 == object3 || object2 != null && object2.equals(object3)) {
                    f01 = f02;
                }
            }
            if(f01 != null) {
                z = true;
                g01.c(f01, true);
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.b.d;
    }
}

