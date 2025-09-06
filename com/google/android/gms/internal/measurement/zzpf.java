package com.google.android.gms.internal.measurement;

public final class zzpf implements zzpe {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zzpf.zza = zzhy0.zzf("measurement.collection.enable_session_stitching_token.client.dev", true);
        zzpf.zzb = zzhy0.zzf("measurement.session_stitching_token_enabled", false);
        zzpf.zzc = zzhy0.zzf("measurement.collection.enable_session_stitching_token.service", false);
        zzpf.zzd = zzhy0.zzf("measurement.collection.enable_session_stitching_token.service_new", true);
        zzpf.zze = zzhy0.zzd("measurement.id.collection.enable_session_stitching_token.client.dev", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpe
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpe
    public final boolean zzb() {
        return ((Boolean)zzpf.zza.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpe
    public final boolean zzc() {
        return ((Boolean)zzpf.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpe
    public final boolean zzd() {
        return ((Boolean)zzpf.zzc.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzpe
    public final boolean zze() {
        return ((Boolean)zzpf.zzd.zzb()).booleanValue();
    }
}

