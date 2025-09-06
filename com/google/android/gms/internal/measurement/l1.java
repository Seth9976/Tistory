package com.google.android.gms.internal.measurement;

public final class l1 implements zzlx {
    public final zzlm a;
    public final x1 b;
    public final boolean c;

    public l1(x1 x10, v0 v00, zzlm zzlm0) {
        this.b = x10;
        this.c = zzlm0 instanceof zzkc;
        this.a = zzlm0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object object0) {
        this.b.getClass();
        int v = ((zzkf)object0).zzc.zzb();
        if(!this.c) {
            return v;
        }
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object object0) {
        this.b.getClass();
        int v = ((zzkf)object0).zzc.hashCode();
        if(!this.c) {
            return v;
        }
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        zzlm zzlm0 = this.a;
        return zzlm0 instanceof zzkf ? ((zzkf)((zzkf)zzlm0).zzl(4, null, null)) : zzlm0.zzbG().zzaE();
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object object0) {
        this.b.getClass();
        x1.c(object0);
        v0.b(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object object0, Object object1) {
        r1.c(this.b, object0, object1);
        if(!this.c) {
            return;
        }
        v0.a(object1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object object0, byte[] arr_b, int v, int v1, m0 m00) {
        if(((zzkf)object0).zzc == zzmp.zzc()) {
            ((zzkf)object0).zzc = zzmp.a();
        }
        zzkc zzkc0 = (zzkc)object0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object object0, zzng zzng0) {
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object object0, Object object1) {
        this.b.getClass();
        if(!((zzkf)object0).zzc.equals(((zzkf)object1).zzc)) {
            return false;
        }
        if(!this.c) {
            return true;
        }
        v0.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object object0) {
        v0.a(object0);
        throw null;
    }
}

