package com.google.android.gms.internal.measurement;

public final class zzok implements zzoj {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zzok.zza = zzhy0.zzf("measurement.client.global_params", true);
        zzok.zzb = zzhy0.zzf("measurement.service.global_params_in_payload", true);
        zzok.zzc = zzhy0.zzf("measurement.service.clear_global_params_on_uninstall", true);
        zzok.zzd = zzhy0.zzf("measurement.service.global_params", true);
        zzok.zze = zzhy0.zzd("measurement.id.service.global_params", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoj
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoj
    public final boolean zzb() {
        return ((Boolean)zzok.zzc.zzb()).booleanValue();
    }
}

