package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;
import g.a;

@VisibleForTesting
public final class zzdt {
    public final String a;
    public final zzdq b;
    public final Object c;
    public final Object d;
    public final Object e;
    public volatile Object f;
    public static final Object g;

    static {
        zzdt.g = new Object();
    }

    public zzdt(String s, Object object0, Object object1, zzdq zzdq0) {
        this.e = new Object();
        this.f = null;
        this.a = s;
        this.c = object0;
        this.d = object1;
        this.b = zzdq0;
    }

    public final Object zza(Object object0) {
        Object object4;
        synchronized(this.e) {
        }
        if(object0 != null) {
            return object0;
        }
        if(a.d == null) {
            return this.c;
        }
        synchronized(zzdt.g) {
            if(zzab.zza()) {
                return this.f == null ? this.c : this.f;
            }
        }
        try {
            for(Object object3: zzdu.a) {
                zzdt zzdt0 = (zzdt)object3;
                if(zzab.zza()) {
                    throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                }
                try {
                    object4 = null;
                    zzdq zzdq0 = zzdt0.b;
                    if(zzdq0 != null) {
                        object4 = zzdq0.zza();
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                synchronized(zzdt.g) {
                    zzdt0.f = object4;
                }
            }
        }
        catch(SecurityException unused_ex) {
        }
        zzdq zzdq1 = this.b;
        if(zzdq1 == null) {
            return this.c;
        }
        try {
            return zzdq1.zza();
        }
        catch(SecurityException unused_ex) {
            return this.c;
        }
        catch(IllegalStateException unused_ex) {
            return this.c;
        }
    }

    public final String zzb() {
        return this.a;
    }
}

