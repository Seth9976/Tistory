package com.google.android.gms.internal.measurement;

public final class g0 extends zzig {
    public final Object a;

    public g0(Object object0) {
        this.a = object0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof g0 ? this.a.equals(((g0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + 0x598DF91C;
    }

    @Override
    public final String toString() {
        return "Optional.of(" + this.a + ")";
    }

    @Override  // com.google.android.gms.internal.measurement.zzig
    public final Object zza() {
        return this.a;
    }

    @Override  // com.google.android.gms.internal.measurement.zzig
    public final boolean zzb() {
        return true;
    }
}

