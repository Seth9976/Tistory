package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

public final class d0 implements Runnable {
    public final int a;
    public final long b;
    public final zzhx c;

    public d0(zzhx zzhx0, long v, int v1) {
        this.a = v1;
        this.c = zzhx0;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.c.c(this.b, true);
            this.c.zzt.zzt().zzu(new AtomicReference());
            return;
        }
        this.c.zzt.zzm().i.zzb(this.b);
        this.c.zzt.zzay().zzc().zzb("Session timeout duration set", this.b);
    }
}

