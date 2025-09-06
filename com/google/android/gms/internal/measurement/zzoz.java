package com.google.android.gms.internal.measurement;

public final class zzoz implements zzoy {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;
    public static final zzib zzf;
    public static final zzib zzg;
    public static final zzib zzh;
    public static final zzib zzi;
    public static final zzib zzj;
    public static final zzib zzk;
    public static final zzib zzl;
    public static final zzib zzm;
    public static final zzib zzn;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza();
        zzoz.zza = zzhy0.zzf("measurement.redaction.app_instance_id", true);
        zzoz.zzb = zzhy0.zzf("measurement.redaction.client_ephemeral_aiid_generation", true);
        zzoz.zzc = zzhy0.zzf("measurement.redaction.config_redacted_fields", true);
        zzoz.zzd = zzhy0.zzf("measurement.redaction.device_info", true);
        zzoz.zze = zzhy0.zzf("measurement.redaction.e_tag", true);
        zzoz.zzf = zzhy0.zzf("measurement.redaction.enhanced_uid", true);
        zzoz.zzg = zzhy0.zzf("measurement.redaction.populate_ephemeral_app_instance_id", true);
        zzoz.zzh = zzhy0.zzf("measurement.redaction.google_signals", true);
        zzoz.zzi = zzhy0.zzf("measurement.redaction.no_aiid_in_config_request", true);
        zzoz.zzj = zzhy0.zzf("measurement.redaction.retain_major_os_version", true);
        zzoz.zzk = zzhy0.zzf("measurement.redaction.scion_payload_generator", true);
        zzoz.zzl = zzhy0.zzf("measurement.redaction.upload_redacted_fields", true);
        zzoz.zzm = zzhy0.zzf("measurement.redaction.upload_subdomain_override", true);
        zzoz.zzn = zzhy0.zzf("measurement.redaction.user_id", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zzb() {
        return ((Boolean)zzoz.zzb.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zzc() {
        return ((Boolean)zzoz.zze.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zzd() {
        return ((Boolean)zzoz.zzj.zzb()).booleanValue();
    }

    @Override  // com.google.android.gms.internal.measurement.zzoy
    public final boolean zze() {
        return ((Boolean)zzoz.zzk.zzb()).booleanValue();
    }
}

