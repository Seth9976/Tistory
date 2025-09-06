package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

public final class k extends AbstractSet {
    public final int a;
    public final LinkedTreeMap b;

    public k(LinkedTreeMap linkedTreeMap0, int v) {
        this.a = v;
        this.b = linkedTreeMap0;
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
            LinkedTreeMap linkedTreeMap0 = this.b;
            linkedTreeMap0.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            m m0 = null;
            m m1 = null;
            if(object1 != null) {
                try {
                    m1 = linkedTreeMap0.a(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(m1 != null && Objects.equals(m1.h, ((Map.Entry)object0).getValue())) {
                m0 = m1;
            }
            return m0 != null;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.a == 0 ? new j(this.b, 0) : new j(this.b, 1);
    }

    @Override
    public final boolean remove(Object object0) {
        boolean z = false;
        if(this.a != 0) {
            LinkedTreeMap linkedTreeMap0 = this.b;
            linkedTreeMap0.getClass();
            m m0 = null;
            if(object0 != null) {
                try {
                    m0 = linkedTreeMap0.a(object0, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(m0 != null) {
                linkedTreeMap0.c(m0, true);
            }
            return m0 != null;
        }
        if(object0 instanceof Map.Entry) {
            LinkedTreeMap linkedTreeMap1 = this.b;
            linkedTreeMap1.getClass();
            Object object1 = ((Map.Entry)object0).getKey();
            m m1 = null;
            m m2 = null;
            if(object1 != null) {
                try {
                    m2 = linkedTreeMap1.a(object1, false);
                }
                catch(ClassCastException unused_ex) {
                }
            }
            if(m2 != null && Objects.equals(m2.h, ((Map.Entry)object0).getValue())) {
                m1 = m2;
            }
            if(m1 != null) {
                z = true;
                linkedTreeMap1.c(m1, true);
            }
        }
        return z;
    }

    @Override
    public final int size() {
        return this.b.d;
    }
}

