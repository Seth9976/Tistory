package com.google.android.gms.internal.measurement;

public final class f0 extends zzig {
    public static final f0 a;

    static {
        f0.a = new f0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this;
    }

    @Override
    public final int hashCode() {
        return 2040732332;
    }

    @Override
    public final String toString() {
        return "Optional.absent()";
    }

    @Override  // com.google.android.gms.internal.measurement.zzig
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override  // com.google.android.gms.internal.measurement.zzig
    public final boolean zzb() {
        return false;
    }
}

