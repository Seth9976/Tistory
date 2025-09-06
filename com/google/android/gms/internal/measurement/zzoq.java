package com.google.android.gms.internal.measurement;

public final class zzoq implements zzop {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zzoq.zza = zzhy0.zzd("measurement.id.lifecycle.app_in_background_parameter", 0L);
        zzoq.zzb = zzhy0.zzf("measurement.lifecycle.app_backgrounded_tracking", true);
        zzoq.zzc = zzhy0.zzf("measurement.lifecycle.app_in_background_parameter", false);
        zzoq.zzd = zzhy0.zzd("measurement.id.lifecycle.app_backgrounded_tracking", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzop
    public final boolean zza() {
        return ((Boolean)zzoq.zzc.zzb()).booleanValue();
    }
}

