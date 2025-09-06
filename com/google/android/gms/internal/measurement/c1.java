package com.google.android.gms.internal.measurement;

public final class c1 extends d1 {
    @Override  // com.google.android.gms.internal.measurement.d1
    public final void a(Object object0, long v) {
        ((zzkm)d2.c.m(object0, v)).zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.d1
    public final void b(long v, Object object0, Object object1) {
        zzkm zzkm0 = (zzkm)d2.c.m(object0, v);
        zzkm zzkm1 = (zzkm)d2.c.m(object1, v);
        int v1 = zzkm0.size();
        int v2 = zzkm1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzkm0.zzc()) {
                zzkm0 = zzkm0.zzd(v2 + v1);
            }
            zzkm0.addAll(zzkm1);
        }
        if(v1 > 0) {
            zzkm1 = zzkm0;
        }
        d2.o(v, object0, zzkm1);
    }
}

