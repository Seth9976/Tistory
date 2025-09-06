package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzof;

public final class i1 {
    public long a;
    public long b;
    public final h1 c;
    public final zzkc d;

    public i1(zzkc zzkc0) {
        this.d = zzkc0;
        this.c = new h1(this, zzkc0.zzt, 0);
        long v = zzkc0.zzt.zzav().elapsedRealtime();
        this.a = v;
        this.b = v;
    }

    public final boolean a(long v, boolean z, boolean z1) {
        zzkc zzkc0 = this.d;
        zzkc0.zzg();
        zzkc0.zza();
        zzof.zzc();
        if(!zzkc0.zzt.zzf().zzs(null, zzdu.zzad)) {
            o o1 = zzkc0.zzt.zzm();
            long v2 = zzkc0.zzt.zzav().currentTimeMillis();
            o1.m.zzb(v2);
        }
        else if(zzkc0.zzt.zzJ()) {
            o o0 = zzkc0.zzt.zzm();
            long v1 = zzkc0.zzt.zzav().currentTimeMillis();
            o0.m.zzb(v1);
        }
        long v3 = v - this.a;
        if(!z && v3 < 1000L) {
            zzkc0.zzt.zzay().zzj().zzb("Screen exposed for less than 1000 ms. Event not sent. time", v3);
            return false;
        }
        if(!z1) {
            v3 = v - this.b;
            this.b = v;
        }
        zzkc0.zzt.zzay().zzj().zzb("Recording user engagement, ms", v3);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_et", v3);
        boolean z2 = zzkc0.zzt.zzf().zzu();
        zzlb.zzK(zzkc0.zzt.zzs().zzj(!z2), bundle0, true);
        if(!z1) {
            zzkc0.zzt.zzq().a("auto", "_e", bundle0);
        }
        this.a = v;
        this.c.a();
        this.c.c(3600000L);
        return true;
    }
}

