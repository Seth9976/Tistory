package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzt extends zzai {
    public final zzr a;

    public zzt(zzr zzr0) {
        super("internal.logger");
        this.a = zzr0;
        h2 h20 = new h2(this, false, true);
        this.zze.put("log", h20);
        g2 g20 = new g2("silent", 0);
        this.zze.put("silent", g20);
        ((zzai)this.zze.get("silent")).zzr("log", new h2(this, true, true));
        g2 g21 = new g2("unmonitored", 1);
        this.zze.put("unmonitored", g21);
        ((zzai)this.zze.get("unmonitored")).zzr("log", new h2(this, false, false));
    }

    @Override  // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzg0, List list0) {
        return zzap.zzf;
    }
}

