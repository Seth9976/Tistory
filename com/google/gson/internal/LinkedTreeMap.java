package com.google.gson.internal;

import androidx.constraintlayout.core.c;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class LinkedTreeMap extends AbstractMap implements Serializable {
    public final Comparator a;
    public final boolean b;
    public m c;
    public int d;
    public int e;
    public final m f;
    public k g;
    public k h;
    public static final c i;

    static {
        LinkedTreeMap.i = new c(8);
    }

    public LinkedTreeMap() {
        this(LinkedTreeMap.i, true);
    }

    public LinkedTreeMap(Comparator comparator0, boolean z) {
        this.d = 0;
        this.e = 0;
        if(comparator0 == null) {
            comparator0 = LinkedTreeMap.i;
        }
        this.a = comparator0;
        this.b = z;
        this.f = new m(z);
    }

    public LinkedTreeMap(boolean z) {
        this(LinkedTreeMap.i, z);
    }

    public final m a(Object object0, boolean z) {
        m m3;
        int v;
        m m0 = this.c;
        c c0 = LinkedTreeMap.i;
        Comparator comparator0 = this.a;
        if(m0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == c0 ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, m0.f) : comparable0.compareTo(m0.f);
                if(v == 0) {
                    return m0;
                }
                m m1 = v >= 0 ? m0.c : m0.b;
                if(m1 == null) {
                    break;
                }
                m0 = m1;
            }
        }
        if(!z) {
            return null;
        }
        m m2 = this.f;
        if(m0 == null) {
            if(comparator0 == c0 && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            m3 = new m(this.b, null, object0, m2, m2.e);
            this.c = m3;
        }
        else {
            m3 = new m(this.b, m0, object0, m2, m2.e);
            if(v < 0) {
                m0.b = m3;
            }
            else {
                m0.c = m3;
            }
            this.b(m0, true);
        }
        ++this.d;
        ++this.e;
        return m3;
    }

    public final void b(m m0, boolean z) {
    alab1:
        while(m0 != null) {
            m m1 = m0.b;
            m m2 = m0.c;
            int v = 0;
            int v1 = m1 == null ? 0 : m1.i;
            int v2 = m2 == null ? 0 : m2.i;
            int v3 = v1 - v2;
            if(v3 == -2) {
                m m3 = m2.b;
                int v4 = m2.c == null ? 0 : m2.c.i;
                if(m3 != null) {
                    v = m3.i;
                }
                if(v - v4 != -1 && (v - v4 != 0 || z)) {
                    this.f(m2);
                }
                this.e(m0);
                if(z) {
                    return;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        m0.i = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        m m4 = m1.b;
                        int v5 = m1.c == null ? 0 : m1.c.i;
                        if(m4 != null) {
                            v = m4.i;
                        }
                        if(v - v5 != 1 && (v - v5 != 0 || z)) {
                            this.e(m1);
                        }
                        this.f(m0);
                        if(z) {
                            return;
                        }
                        break;
                    }
                    default: {
                        m0.i = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            m0 = m0.a;
        }
    }

    public final void c(m m0, boolean z) {
        int v1;
        m m8;
        m m5;
        if(z) {
            m0.e.d = m0.d;
            m0.d.e = m0.e;
        }
        m m1 = m0.b;
        m m2 = m0.c;
        m m3 = m0.a;
        int v = 0;
        if(m1 != null && m2 != null) {
            if(m1.i > m2.i) {
                for(m m4 = m1.c; true; m4 = m1.c) {
                    m5 = m1;
                    m1 = m4;
                    if(m1 == null) {
                        break;
                    }
                }
            }
            else {
                for(m m6 = m2.b; true; m6 = m2.b) {
                    m m7 = m2;
                    m2 = m6;
                    m8 = m7;
                    if(m2 == null) {
                        break;
                    }
                }
                m5 = m8;
            }
            this.c(m5, false);
            m m9 = m0.b;
            if(m9 == null) {
                v1 = 0;
            }
            else {
                v1 = m9.i;
                m5.b = m9;
                m9.a = m5;
                m0.b = null;
            }
            m m10 = m0.c;
            if(m10 != null) {
                v = m10.i;
                m5.c = m10;
                m10.a = m5;
                m0.c = null;
            }
            m5.i = Math.max(v1, v) + 1;
            this.d(m0, m5);
            return;
        }
        if(m1 != null) {
            this.d(m0, m1);
            m0.b = null;
        }
        else if(m2 == null) {
            this.d(m0, null);
        }
        else {
            this.d(m0, m2);
            m0.c = null;
        }
        this.b(m3, false);
        --this.d;
        ++this.e;
    }

    @Override
    public void clear() {
        this.c = null;
        this.d = 0;
        ++this.e;
        this.f.e = this.f;
        this.f.d = this.f;
    }

    @Override
    public boolean containsKey(Object object0) {
        m m0 = null;
        if(object0 != null) {
            try {
                m0 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return m0 != null;
    }

    public final void d(m m0, m m1) {
        m m2 = m0.a;
        m0.a = null;
        if(m1 != null) {
            m1.a = m2;
        }
        if(m2 != null) {
            if(m2.b == m0) {
                m2.b = m1;
                return;
            }
            m2.c = m1;
            return;
        }
        this.c = m1;
    }

    public final void e(m m0) {
        m m1 = m0.b;
        m m2 = m0.c;
        m m3 = m2.b;
        m m4 = m2.c;
        m0.c = m3;
        if(m3 != null) {
            m3.a = m0;
        }
        this.d(m0, m2);
        m2.b = m0;
        m0.a = m2;
        int v = 0;
        int v1 = Math.max((m1 == null ? 0 : m1.i), (m3 == null ? 0 : m3.i));
        m0.i = v1 + 1;
        if(m4 != null) {
            v = m4.i;
        }
        m2.i = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public Set entrySet() {
        k k0 = this.g;
        if(k0 == null) {
            k0 = new k(this, 0);
            this.g = k0;
        }
        return k0;
    }

    public final void f(m m0) {
        m m1 = m0.b;
        m m2 = m0.c;
        m m3 = m1.b;
        m m4 = m1.c;
        m0.b = m4;
        if(m4 != null) {
            m4.a = m0;
        }
        this.d(m0, m1);
        m1.c = m0;
        m0.a = m1;
        int v = 0;
        int v1 = Math.max((m2 == null ? 0 : m2.i), (m4 == null ? 0 : m4.i));
        m0.i = v1 + 1;
        if(m3 != null) {
            v = m3.i;
        }
        m1.i = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public Object get(Object object0) {
        m m0 = null;
        if(object0 != null) {
            try {
                m0 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return m0 == null ? null : m0.h;
    }

    @Override
    public Set keySet() {
        k k0 = this.h;
        if(k0 == null) {
            k0 = new k(this, 1);
            this.h = k0;
        }
        return k0;
    }

    @Override
    public Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        if(object1 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        m m0 = this.a(object0, true);
        Object object2 = m0.h;
        m0.h = object1;
        return object2;
    }

    @Override
    public Object remove(Object object0) {
        m m0 = null;
        if(object0 != null) {
            try {
                m0 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        if(m0 != null) {
            this.c(m0, true);
        }
        return m0 == null ? null : m0.h;
    }

    @Override
    public int size() {
        return this.d;
    }
}

