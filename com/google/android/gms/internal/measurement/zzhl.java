package com.google.android.gms.internal.measurement;

public final class zzhl implements zzhj {
    public final d0 zza;
    public final String zzb;

    public zzhl(d0 d00, String s) {
        this.zza = d00;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.measurement.zzhj
    public final Object zza() {
        return zzha.zza(this.zza.a.getContentResolver(), this.zzb, null);
    }
}

