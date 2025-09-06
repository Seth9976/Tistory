package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.room.a;

public final class zzd extends j {
    public final ArrayMap a;
    public final ArrayMap b;
    public long c;

    public zzd(zzfr zzfr0) {
        super(zzfr0);
        this.b = new ArrayMap();
        this.a = new ArrayMap();
    }

    public final void a(long v, zzie zzie0) {
        if(zzie0 == null) {
            a.B(this.zzt, "Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzt.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        zzlb.zzK(zzie0, bundle0, true);
        this.zzt.zzq().a("am", "_xa", bundle0);
    }

    public final void b(String s, long v, zzie zzie0) {
        if(zzie0 == null) {
            a.B(this.zzt, "Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.zzt.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", v);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        zzlb.zzK(zzie0, bundle0, true);
        this.zzt.zzq().a("am", "_xu", bundle0);
    }

    public final void c(long v) {
        ArrayMap arrayMap0 = this.a;
        for(Object object0: arrayMap0.keySet()) {
            arrayMap0.put(((String)object0), v);
        }
        if(!arrayMap0.isEmpty()) {
            this.c = v;
        }
    }

    public final void zzd(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzt.zzaz().zzp(new com.google.android.gms.measurement.internal.a(this, s, v, 0));
            return;
        }
        a.v(this.zzt, "Ad unit id must be a non-empty string");
    }

    public final void zze(String s, long v) {
        if(s != null && s.length() != 0) {
            this.zzt.zzaz().zzp(new com.google.android.gms.measurement.internal.a(this, s, v, 1));
            return;
        }
        a.v(this.zzt, "Ad unit id must be a non-empty string");
    }

    @WorkerThread
    public final void zzf(long v) {
        zzie zzie0 = this.zzt.zzs().zzj(false);
        ArrayMap arrayMap0 = this.a;
        for(Object object0: arrayMap0.keySet()) {
            this.b(((String)object0), v - ((long)(((Long)arrayMap0.get(((String)object0))))), zzie0);
        }
        if(!arrayMap0.isEmpty()) {
            this.a(v - this.c, zzie0);
        }
        this.c(v);
    }
}

