package com.google.android.gms.internal.measurement;

public final class u0 {
    public final zzlm a;
    public final int b;

    public u0(zzlm zzlm0, int v) {
        this.a = zzlm0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof u0 ? this.a == ((u0)object0).a && this.b == ((u0)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

