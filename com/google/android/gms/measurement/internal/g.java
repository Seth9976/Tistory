package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

public abstract class g {
    public final zzgm a;
    public final f b;
    public volatile long c;
    public static volatile zzby d;

    public g(zzgm zzgm0) {
        Preconditions.checkNotNull(zzgm0);
        this.a = zzgm0;
        this.b = new f(0, this, zzgm0);
    }

    public final void a() {
        this.c = 0L;
        this.d().removeCallbacks(this.b);
    }

    public abstract void b();

    public final void c(long v) {
        this.a();
        if(v >= 0L) {
            this.c = this.a.zzav().currentTimeMillis();
            if(!this.d().postDelayed(this.b, v)) {
                this.a.zzay().zzd().zzb("Failed to schedule delayed post. time", v);
            }
        }
    }

    public final Handler d() {
        if(g.d != null) {
            return g.d;
        }
        synchronized(g.class) {
            if(g.d == null) {
                g.d = new zzby(this.a.zzau().getMainLooper());
            }
            return g.d;
        }
    }
}

