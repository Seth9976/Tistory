package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class f0 implements Runnable {
    public final AtomicReference a;
    public final boolean b;
    public final zzhx c;

    public f0(zzhx zzhx0, AtomicReference atomicReference0, boolean z) {
        this.c = zzhx0;
        this.a = atomicReference0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.c.zzt.zzt().zzx(this.a, this.b);
    }
}

