package com.google.android.gms.internal.measurement;

public final class zzns implements zznr {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zzns.zza = zzhy0.zzf("measurement.client.consent_state_v1", true);
        zzns.zzb = zzhy0.zzf("measurement.client.3p_consent_state_v1", true);
        zzns.zzc = zzhy0.zzf("measurement.service.consent_state_v1_W36", true);
        zzns.zzd = zzhy0.zzd("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override  // com.google.android.gms.internal.measurement.zznr
    public final long zza() {
        return (long)(((Long)zzns.zzd.zzb()));
    }
}

