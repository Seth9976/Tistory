package l7;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzhy;
import java.util.List;
import java.util.Map;

public final class b extends c {
    public final zzhy a;

    public b(zzhy zzhy0) {
        Preconditions.checkNotNull(zzhy0);
        this.a = zzhy0;
    }

    @Override  // l7.c
    public final Boolean a() {
        return (Boolean)this.a.zzg(4);
    }

    @Override  // l7.c
    public final Double b() {
        return (Double)this.a.zzg(2);
    }

    @Override  // l7.c
    public final Integer c() {
        return (Integer)this.a.zzg(3);
    }

    @Override  // l7.c
    public final Long d() {
        return (Long)this.a.zzg(1);
    }

    @Override  // l7.c
    public final String e() {
        return (String)this.a.zzg(0);
    }

    @Override  // l7.c
    public final Map f(boolean z) {
        return this.a.zzo(null, null, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final int zza(String s) {
        return this.a.zza(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final long zzb() {
        return this.a.zzb();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final Object zzg(int v) {
        return this.a.zzg(v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzh() {
        return this.a.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzi() {
        return this.a.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzj() {
        return this.a.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final String zzk() {
        return this.a.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final List zzm(String s, String s1) {
        return this.a.zzm(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final Map zzo(String s, String s1, boolean z) {
        return this.a.zzo(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzp(String s) {
        this.a.zzp(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzq(String s, String s1, Bundle bundle0) {
        this.a.zzq(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzr(String s) {
        this.a.zzr(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzs(String s, String s1, Bundle bundle0) {
        this.a.zzs(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzt(String s, String s1, Bundle bundle0, long v) {
        this.a.zzt(s, s1, bundle0, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzu(zzgs zzgs0) {
        this.a.zzu(zzgs0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzv(Bundle bundle0) {
        this.a.zzv(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzw(zzgr zzgr0) {
        this.a.zzw(zzgr0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzhy
    public final void zzx(zzgs zzgs0) {
        this.a.zzx(zzgs0);
    }
}

