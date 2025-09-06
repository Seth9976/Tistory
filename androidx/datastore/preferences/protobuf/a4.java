package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class a4 extends c4 {
    public final int b;

    public a4(Unsafe unsafe0, int v) {
        this.b = v;
        super(unsafe0);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void c(long v, byte[] arr_b, long v1, long v2) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void d(byte[] arr_b, long v, long v1, long v2) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final boolean e(Object object0, long v) {
        if(this.b != 0) {
            return d4.h ? d4.j(object0, v) != 0 : d4.k(object0, v) != 0;
        }
        return d4.h ? d4.j(object0, v) != 0 : d4.k(object0, v) != 0;
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final byte f(long v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final byte g(Object object0, long v) {
        if(this.b != 0) {
            return d4.h ? d4.j(object0, v) : d4.k(object0, v);
        }
        return d4.h ? d4.j(object0, v) : d4.k(object0, v);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final double h(Object object0, long v) {
        return Double.longBitsToDouble(this.l(object0, v));
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final float i(Object object0, long v) {
        return Float.intBitsToFloat(this.j(object0, v));
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final long k(long v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void o(Object object0, long v, boolean z) {
        if(this.b != 0) {
            if(d4.h) {
                d4.s(object0, v, ((byte)z));
                return;
            }
            d4.t(object0, v, ((byte)z));
            return;
        }
        if(d4.h) {
            d4.s(object0, v, ((byte)z));
            return;
        }
        d4.t(object0, v, ((byte)z));
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void p(long v, byte b) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void q(Object object0, long v, byte b) {
        if(this.b != 0) {
            if(d4.h) {
                d4.s(object0, v, b);
                return;
            }
            d4.t(object0, v, b);
            return;
        }
        if(d4.h) {
            d4.s(object0, v, b);
            return;
        }
        d4.t(object0, v, b);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void r(Object object0, long v, double f) {
        if(this.b != 0) {
            this.u(object0, v, Double.doubleToLongBits(f));
            return;
        }
        this.u(object0, v, Double.doubleToLongBits(f));
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final void s(Object object0, long v, float f) {
        if(this.b != 0) {
            this.t(Float.floatToIntBits(f), v, object0);
            return;
        }
        this.t(Float.floatToIntBits(f), v, object0);
    }

    @Override  // androidx.datastore.preferences.protobuf.c4
    public final boolean x() {
        return false;
    }
}

