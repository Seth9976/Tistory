package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

public final class zzjr {
    public final Map a;
    public static volatile zzjr b;
    public static final zzjr c;
    public static final int zzb;

    static {
        zzjr.c = new zzjr();
    }

    public zzjr() {
        this.a = Collections.emptyMap();
    }

    public static zzjr zza() {
        zzjr zzjr0 = zzjr.b;
        if(zzjr0 != null) {
            return zzjr0;
        }
        synchronized(zzjr.class) {
            zzjr zzjr1 = zzjr.b;
            if(zzjr1 != null) {
                return zzjr1;
            }
            zzjr zzjr2 = y0.a();
            zzjr.b = zzjr2;
            return zzjr2;
        }
    }

    public final zzkd zzb(zzlm zzlm0, int v) {
        u0 u00 = new u0(zzlm0, v);
        return (zzkd)this.a.get(u00);
    }
}

