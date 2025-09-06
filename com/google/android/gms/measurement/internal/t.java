package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

public final class t implements Thread.UncaughtExceptionHandler {
    public final String a;
    public final zzfo b;

    public t(zzfo zzfo0, String s) {
        this.b = zzfo0;
        Preconditions.checkNotNull(s);
        this.a = s;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        synchronized(this) {
            this.b.zzt.zzay().zzd().zzb(this.a, throwable0);
        }
    }
}

