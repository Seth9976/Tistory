package com.google.android.gms.internal.measurement;

public final class e implements zzbf {
    public final int a;
    public final zzg b;
    public final String c;

    public e(zzg zzg0, String s, int v) {
        this.a = v;
        this.b = zzg0;
        this.c = s;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzbf
    public final zzg zza(zzap zzap0) {
        switch(this.a) {
            case 0: {
                zzg zzg0 = this.b.zza();
                zzg0.zzf(this.c, zzap0);
                return zzg0;
            }
            case 1: {
                zzg zzg1 = this.b.zza();
                zzg1.zze(this.c, zzap0);
                return zzg1;
            }
            default: {
                this.b.zze(this.c, zzap0);
                return this.b;
            }
        }
    }
}

