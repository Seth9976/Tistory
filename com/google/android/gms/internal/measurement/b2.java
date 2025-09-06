package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

public final class b2 extends c2 {
    public final int b;

    public b2(Unsafe unsafe0, int v) {
        this.b = v;
        super(unsafe0);
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final double a(Object object0, long v) {
        return Double.longBitsToDouble(this.k(object0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final float b(Object object0, long v) {
        return Float.intBitsToFloat(this.j(object0, v));
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final void c(Object object0, long v, boolean z) {
        if(this.b != 0) {
            if(d2.g) {
                d2.b(object0, v, ((byte)z));
                return;
            }
            d2.c(object0, v, ((byte)z));
            return;
        }
        if(d2.g) {
            d2.b(object0, v, ((byte)z));
            return;
        }
        d2.c(object0, v, ((byte)z));
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final void d(Object object0, long v, byte b) {
        if(this.b != 0) {
            if(d2.g) {
                d2.b(object0, v, b);
                return;
            }
            d2.c(object0, v, b);
            return;
        }
        if(d2.g) {
            d2.b(object0, v, b);
            return;
        }
        d2.c(object0, v, b);
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final void e(Object object0, long v, double f) {
        if(this.b != 0) {
            this.o(object0, v, Double.doubleToLongBits(f));
            return;
        }
        this.o(object0, v, Double.doubleToLongBits(f));
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final void f(Object object0, long v, float f) {
        if(this.b != 0) {
            this.n(Float.floatToIntBits(f), v, object0);
            return;
        }
        this.n(Float.floatToIntBits(f), v, object0);
    }

    @Override  // com.google.android.gms.internal.measurement.c2
    public final boolean g(Object object0, long v) {
        if(this.b != 0) {
            return d2.g ? d2.p(object0, v) : d2.q(object0, v);
        }
        return d2.g ? d2.p(object0, v) : d2.q(object0, v);
    }
}

