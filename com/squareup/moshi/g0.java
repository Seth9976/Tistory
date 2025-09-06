package com.squareup.moshi;

import androidx.constraintlayout.core.c;
import j2.d;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

public final class g0 extends AbstractMap implements Serializable {
    public final Comparator a;
    public f0[] b;
    public final f0 c;
    public int d;
    public int e;
    public int f;
    public e0 g;
    public e0 h;
    public static final c i;

    static {
        g0.i = new c(9);
    }

    public g0() {
        this.d = 0;
        this.e = 0;
        this.a = g0.i;
        this.c = new f0();
        this.b = new f0[16];
        this.f = 12;
    }

    public final f0 a(Object object0, boolean z) {
        f0 f020;
        f0 f019;
        f0 f016;
        f0 f011;
        f0 f08;
        f0 f05;
        f0 f03;
        int v5;
        f0[] arr_f0 = this.b;
        int v = object0.hashCode();
        int v1 = v ^ (v >>> 20 ^ v >>> 12);
        int v2 = v1 >>> 7 ^ v1 ^ v1 >>> 4;
        int v3 = v2 & arr_f0.length - 1;
        f0 f00 = arr_f0[v3];
        c c0 = g0.i;
        Comparator comparator0 = this.a;
        if(f00 == null) {
            f03 = null;
            v5 = 0;
        }
        else {
            Comparable comparable0 = comparator0 == c0 ? ((Comparable)object0) : null;
            while(true) {
                int v4 = comparable0 == null ? comparator0.compare(object0, f00.f) : comparable0.compareTo(f00.f);
                if(v4 == 0) {
                    return f00;
                }
                f0 f02 = v4 >= 0 ? f00.c : f00.b;
                if(f02 == null) {
                    v5 = v4;
                    f03 = f00;
                    break;
                }
                f00 = f02;
            }
        }
        if(!z) {
            return null;
        }
        f0 f04 = this.c;
        if(f03 == null) {
            if(comparator0 == c0 && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            f05 = new f0(null, object0, v2, f04, f04.e);
            arr_f0[v3] = f05;
        }
        else {
            f0 f06 = new f0(f03, object0, v2, f04, f04.e);
            if(v5 < 0) {
                f03.b = f06;
            }
            else {
                f03.c = f06;
            }
            this.b(f03, true);
            f05 = f06;
        }
        int v6 = this.d;
        this.d = v6 + 1;
        if(v6 > this.f) {
            f0[] arr_f01 = this.b;
            int v7 = arr_f01.length * 2;
            f0[] arr_f02 = new f0[v7];
            d d0 = new d(2);
            d d1 = new d(2);
            int v8 = 0;
            for(f0 f01 = null; v8 < arr_f01.length; f01 = f08) {
                f0 f07 = arr_f01[v8];
                if(f07 == null) {
                    f08 = f01;
                }
                else {
                    f0 f09 = f07;
                    f0 f010 = f01;
                    while(f09 != null) {
                        f09.a = f010;
                        f010 = f09;
                        f09 = f09.b;
                    }
                    int v9 = 0;
                    int v10 = 0;
                    while(true) {
                        if(f010 == null) {
                            f010 = f01;
                            f011 = null;
                        }
                        else {
                            f0 f012 = f010.a;
                            f010.a = f01;
                            for(f0 f013 = f010.c; true; f013 = f012.b) {
                                f0 f014 = f012;
                                f012 = f013;
                                f011 = f014;
                                if(f012 == null) {
                                    break;
                                }
                                f012.a = f011;
                            }
                        }
                        if(f010 == null) {
                            break;
                        }
                        if((f010.g & arr_f01.length) == 0) {
                            ++v9;
                        }
                        else {
                            ++v10;
                        }
                        f010 = f011;
                        f01 = null;
                    }
                    d0.b = Integer.highestOneBit(v9) * 2 - 1 - v9;
                    d0.e = 0;
                    d0.d = 0;
                    f08 = null;
                    d0.c = null;
                    d1.b = Integer.highestOneBit(v10) * 2 - 1 - v10;
                    d1.e = 0;
                    d1.d = 0;
                    d1.c = null;
                    f0 f015 = null;
                    while(f07 != null) {
                        f07.a = f015;
                        f015 = f07;
                        f07 = f07.b;
                    }
                    while(true) {
                        if(f015 == null) {
                            f016 = null;
                            f015 = null;
                        }
                        else {
                            f0 f017 = f015.a;
                            f015.a = null;
                            for(f0 f018 = f015.c; true; f018 = f017.b) {
                                f016 = f017;
                                f017 = f018;
                                if(f017 == null) {
                                    break;
                                }
                                f017.a = f016;
                            }
                        }
                        if(f015 == null) {
                            break;
                        }
                        if((f015.g & arr_f01.length) == 0) {
                            d0.a(f015);
                        }
                        else {
                            d1.a(f015);
                        }
                        f015 = f016;
                    }
                    if(v9 > 0) {
                        f019 = (f0)d0.c;
                        if(f019.a != null) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        f019 = null;
                    }
                    arr_f02[v8] = f019;
                    int v11 = v8 + arr_f01.length;
                    if(v10 > 0) {
                        f020 = (f0)d1.c;
                        if(f020.a != null) {
                            throw new IllegalStateException();
                        }
                    }
                    else {
                        f020 = null;
                    }
                    arr_f02[v11] = f020;
                }
                ++v8;
            }
            this.b = arr_f02;
            this.f = v7 / 4 + v7 / 2;
        }
        ++this.e;
        return f05;
    }

    public final void b(f0 f00, boolean z) {
    alab1:
        while(f00 != null) {
            f0 f01 = f00.b;
            f0 f02 = f00.c;
            int v = 0;
            int v1 = f01 == null ? 0 : f01.i;
            int v2 = f02 == null ? 0 : f02.i;
            int v3 = v1 - v2;
            if(v3 == -2) {
                f0 f03 = f02.b;
                int v4 = f02.c == null ? 0 : f02.c.i;
                if(f03 != null) {
                    v = f03.i;
                }
                if(v - v4 != -1 && (v - v4 != 0 || z)) {
                    this.f(f02);
                }
                this.e(f00);
                if(z) {
                    return;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        f00.i = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        f0 f04 = f01.b;
                        int v5 = f01.c == null ? 0 : f01.c.i;
                        if(f04 != null) {
                            v = f04.i;
                        }
                        if(v - v5 != 1 && (v - v5 != 0 || z)) {
                            this.e(f01);
                        }
                        this.f(f00);
                        if(z) {
                            return;
                        }
                        break;
                    }
                    default: {
                        f00.i = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            f00 = f00.a;
        }
    }

    public final void c(f0 f00, boolean z) {
        int v1;
        f0 f08;
        f0 f05;
        if(z) {
            f00.e.d = f00.d;
            f00.d.e = f00.e;
            f00.e = null;
            f00.d = null;
        }
        f0 f01 = f00.b;
        f0 f02 = f00.c;
        f0 f03 = f00.a;
        int v = 0;
        if(f01 != null && f02 != null) {
            if(f01.i > f02.i) {
                for(f0 f04 = f01.c; true; f04 = f01.c) {
                    f05 = f01;
                    f01 = f04;
                    if(f01 == null) {
                        break;
                    }
                }
            }
            else {
                for(f0 f06 = f02.b; true; f06 = f02.b) {
                    f0 f07 = f02;
                    f02 = f06;
                    f08 = f07;
                    if(f02 == null) {
                        break;
                    }
                }
                f05 = f08;
            }
            this.c(f05, false);
            f0 f09 = f00.b;
            if(f09 == null) {
                v1 = 0;
            }
            else {
                v1 = f09.i;
                f05.b = f09;
                f09.a = f05;
                f00.b = null;
            }
            f0 f010 = f00.c;
            if(f010 != null) {
                v = f010.i;
                f05.c = f010;
                f010.a = f05;
                f00.c = null;
            }
            f05.i = Math.max(v1, v) + 1;
            this.d(f00, f05);
            return;
        }
        if(f01 != null) {
            this.d(f00, f01);
            f00.b = null;
        }
        else if(f02 == null) {
            this.d(f00, null);
        }
        else {
            this.d(f00, f02);
            f00.c = null;
        }
        this.b(f03, false);
        --this.d;
        ++this.e;
    }

    @Override
    public final void clear() {
        Arrays.fill(this.b, null);
        this.d = 0;
        ++this.e;
        f0 f00 = this.c;
        for(f0 f01 = f00.d; f01 != f00; f01 = f02) {
            f0 f02 = f01.d;
            f01.e = null;
            f01.d = null;
        }
        f00.e = f00;
        f00.d = f00;
    }

    @Override
    public final boolean containsKey(Object object0) {
        f0 f00 = null;
        if(object0 != null) {
            try {
                f00 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return f00 != null;
    }

    public final void d(f0 f00, f0 f01) {
        f0 f02 = f00.a;
        f00.a = null;
        if(f01 != null) {
            f01.a = f02;
        }
        if(f02 != null) {
            if(f02.b == f00) {
                f02.b = f01;
                return;
            }
            f02.c = f01;
            return;
        }
        this.b[f00.g & this.b.length - 1] = f01;
    }

    public final void e(f0 f00) {
        f0 f01 = f00.b;
        f0 f02 = f00.c;
        f0 f03 = f02.b;
        f0 f04 = f02.c;
        f00.c = f03;
        if(f03 != null) {
            f03.a = f00;
        }
        this.d(f00, f02);
        f02.b = f00;
        f00.a = f02;
        int v = 0;
        int v1 = Math.max((f01 == null ? 0 : f01.i), (f03 == null ? 0 : f03.i));
        f00.i = v1 + 1;
        if(f04 != null) {
            v = f04.i;
        }
        f02.i = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public final Set entrySet() {
        e0 e00 = this.g;
        if(e00 == null) {
            e00 = new e0(this, 0);
            this.g = e00;
        }
        return e00;
    }

    public final void f(f0 f00) {
        f0 f01 = f00.b;
        f0 f02 = f00.c;
        f0 f03 = f01.b;
        f0 f04 = f01.c;
        f00.b = f04;
        if(f04 != null) {
            f04.a = f00;
        }
        this.d(f00, f01);
        f01.c = f00;
        f00.a = f01;
        int v = 0;
        int v1 = Math.max((f02 == null ? 0 : f02.i), (f04 == null ? 0 : f04.i));
        f00.i = v1 + 1;
        if(f03 != null) {
            v = f03.i;
        }
        f01.i = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public final Object get(Object object0) {
        f0 f00 = null;
        if(object0 != null) {
            try {
                f00 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return f00 == null ? null : f00.h;
    }

    @Override
    public final Set keySet() {
        e0 e00 = this.h;
        if(e00 == null) {
            e00 = new e0(this, 1);
            this.h = e00;
        }
        return e00;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        f0 f00 = this.a(object0, true);
        Object object2 = f00.h;
        f00.h = object1;
        return object2;
    }

    @Override
    public final Object remove(Object object0) {
        f0 f00 = null;
        if(object0 != null) {
            try {
                f00 = this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        if(f00 != null) {
            this.c(f00, true);
        }
        return f00 == null ? null : f00.h;
    }

    @Override
    public final int size() {
        return this.d;
    }
}

