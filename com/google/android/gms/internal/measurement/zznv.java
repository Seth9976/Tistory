package com.google.android.gms.internal.measurement;

public final class zznv implements zznu {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zznv.zza = zzhy0.zzf("measurement.collection.event_safelist", true);
        zznv.zzb = zzhy0.zzf("measurement.service.store_null_safelist", true);
        zznv.zzc = zzhy0.zzf("measurement.service.store_safelist", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznu
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznu
    public final boolean zzb() {
        return ((Boolean)zznv.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zznu
    public final boolean zzc() {
        return ((Boolean)zznv.zzc.zzb()).booleanValue();
    }
}

