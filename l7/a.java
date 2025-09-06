package l7;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzhx;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.List;
import java.util.Map;

public final class a extends c {
    public final zzfr a;
    public final zzhx b;

    public a(zzfr zzfr0) {
        Preconditions.checkNotNull(zzfr0);
        this.a = zzfr0;
        this.b = zzfr0.zzq();
    }

    @Override  // l7.c
    public final Boolean a() {
        return this.b.zzi();
    }

    @Override  // l7.c
    public final Double b() {
        return this.b.zzj();
    }

    @Override  // l7.c
    public final Integer c() {
        return this.b.zzl();
    }

    @Override  // l7.c
    public final Long d() {
        return this.b.zzm();
    }

    @Override  // l7.c
    public final String e() {
        return this.b.zzr();
    }

    @Override  // l7.c
    public final Map f(boolean z) {
        List list0 = this.b.zzt(z);
        Map map0 = new ArrayMap(list0.size());
        for(Object object0: list0) {
            zzkw zzkw0 = (zzkw)object0;
            Object object1 = zzkw0.zza();
            if(object1 != null) {
                map0.put(zzkw0.zzb, object1);
            }
        }
        return map0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final int zza(String s) {
        this.b.zzh(s);
        return 25;
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final long zzb() {
        return this.a.zzv().zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final Object zzg(int v) {
        zzhx zzhx0 = this.b;
        switch(v) {
            case 0: {
                return zzhx0.zzr();
            }
            case 1: {
                return zzhx0.zzm();
            }
            case 2: {
                return zzhx0.zzj();
            }
            case 3: {
                return zzhx0.zzl();
            }
            default: {
                return zzhx0.zzi();
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzh() {
        return this.b.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzi() {
        return this.b.zzp();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzj() {
        return this.b.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzk() {
        return this.b.zzo();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final List zzm(String s, String s1) {
        return this.b.zzs(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final Map zzo(String s, String s1, boolean z) {
        return this.b.zzu(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzp(String s) {
        this.a.zzd().zzd(s, this.a.zzav().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzq(String s, String s1, Bundle bundle0) {
        this.a.zzq().zzA(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzr(String s) {
        this.a.zzd().zze(s, this.a.zzav().elapsedRealtime());
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzs(String s, String s1, Bundle bundle0) {
        this.b.zzD(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzt(String s, String s1, Bundle bundle0, long v) {
        this.b.zzE(s, s1, bundle0, true, false, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzu(zzgs zzgs0) {
        this.b.zzJ(zzgs0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzv(Bundle bundle0) {
        this.b.zzP(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzw(zzgr zzgr0) {
        this.b.zzT(zzgr0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzx(zzgs zzgs0) {
        this.b.zzZ(zzgs0);
    }
}

