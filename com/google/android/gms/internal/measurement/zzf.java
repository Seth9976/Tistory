package com.google.android.gms.internal.measurement;

public final class zzf {
    public final zzax a;
    public final zzg b;
    public final zzg c;
    public final zzj d;

    public zzf() {
        zzax zzax0 = new zzax();
        this.a = zzax0;
        zzg zzg0 = new zzg(null, zzax0);
        this.c = zzg0;
        this.b = zzg0.zza();
        zzj zzj0 = new zzj();
        this.d = zzj0;
        zzg0.zzg("require", new zzw(zzj0));
        zzj0.zza("internal.platform", () -> new zzy());
        zzg0.zzg("runtime.counter", new zzah(0.0));
    }

    public final zzap zza(zzg zzg0, zzgy[] arr_zzgy) {
        zzap zzap0 = zzap.zzf;
        for(int v = 0; v < arr_zzgy.length; ++v) {
            zzap0 = zzi.zza(arr_zzgy[v]);
            zzh.zzc(this.c);
            if(zzap0 instanceof zzaq || zzap0 instanceof zzao) {
                zzap0 = this.a.zza(zzg0, zzap0);
            }
        }
        return zzap0;
    }
}

