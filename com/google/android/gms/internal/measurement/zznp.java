package com.google.android.gms.internal.measurement;

public final class zznp implements zzno {
    public static final zzib zzA;
    public static final zzib zzB;
    public static final zzib zzC;
    public static final zzib zzD;
    public static final zzib zzE;
    public static final zzib zzF;
    public static final zzib zzG;
    public static final zzib zzH;
    public static final zzib zzI;
    public static final zzib zzJ;
    public static final zzib zzK;
    public static final zzib zzL;
    public static final zzib zzM;
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
    public static final zzib zzo;
    public static final zzib zzp;
    public static final zzib zzq;
    public static final zzib zzr;
    public static final zzib zzs;
    public static final zzib zzt;
    public static final zzib zzu;
    public static final zzib zzv;
    public static final zzib zzw;
    public static final zzib zzx;
    public static final zzib zzy;
    public static final zzib zzz;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zznp.zza = zzhy0.zzd("measurement.ad_id_cache_time", 10000L);
        zznp.zzb = zzhy0.zzd("measurement.max_bundles_per_iteration", 100L);
        zznp.zzc = zzhy0.zzd("measurement.config.cache_time", 86400000L);
        zznp.zzd = zzhy0.zze("measurement.log_tag", "FA");
        zznp.zze = zzhy0.zze("measurement.config.url_authority", "app-measurement.com");
        zznp.zzf = zzhy0.zze("measurement.config.url_scheme", "https");
        zznp.zzg = zzhy0.zzd("measurement.upload.debug_upload_interval", 1000L);
        zznp.zzh = zzhy0.zzd("measurement.lifetimevalue.max_currency_tracked", 4L);
        zznp.zzi = zzhy0.zzd("measurement.store.max_stored_events_per_app", 100000L);
        zznp.zzj = zzhy0.zzd("measurement.experiment.max_ids", 50L);
        zznp.zzk = zzhy0.zzd("measurement.audience.filter_result_max_count", 200L);
        zznp.zzl = zzhy0.zzd("measurement.alarm_manager.minimum_interval", 60000L);
        zznp.zzm = zzhy0.zzd("measurement.upload.minimum_delay", 500L);
        zznp.zzn = zzhy0.zzd("measurement.monitoring.sample_period_millis", 86400000L);
        zznp.zzo = zzhy0.zzd("measurement.upload.realtime_upload_interval", 10000L);
        zznp.zzp = zzhy0.zzd("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        zznp.zzq = zzhy0.zzd("measurement.config.cache_time.service", 3600000L);
        zznp.zzr = zzhy0.zzd("measurement.service_client.idle_disconnect_millis", 5000L);
        zznp.zzs = zzhy0.zze("measurement.log_tag.service", "FA-SVC");
        zznp.zzt = zzhy0.zzd("measurement.upload.stale_data_deletion_interval", 86400000L);
        zznp.zzu = zzhy0.zzd("measurement.sdk.attribution.cache.ttl", 604800000L);
        zznp.zzv = zzhy0.zzd("measurement.redaction.app_instance_id.ttl", 7200000L);
        zznp.zzw = zzhy0.zzd("measurement.upload.backoff_period", 43200000L);
        zznp.zzx = zzhy0.zzd("measurement.upload.initial_upload_delay_time", 15000L);
        zznp.zzy = zzhy0.zzd("measurement.upload.interval", 3600000L);
        zznp.zzz = zzhy0.zzd("measurement.upload.max_bundle_size", 0x10000L);
        zznp.zzA = zzhy0.zzd("measurement.upload.max_bundles", 100L);
        zznp.zzB = zzhy0.zzd("measurement.upload.max_conversions_per_day", 500L);
        zznp.zzC = zzhy0.zzd("measurement.upload.max_error_events_per_day", 1000L);
        zznp.zzD = zzhy0.zzd("measurement.upload.max_events_per_bundle", 1000L);
        zznp.zzE = zzhy0.zzd("measurement.upload.max_events_per_day", 100000L);
        zznp.zzF = zzhy0.zzd("measurement.upload.max_public_events_per_day", 50000L);
        zznp.zzG = zzhy0.zzd("measurement.upload.max_queue_time", 2419200000L);
        zznp.zzH = zzhy0.zzd("measurement.upload.max_realtime_events_per_day", 10L);
        zznp.zzI = zzhy0.zzd("measurement.upload.max_batch_size", 0x10000L);
        zznp.zzJ = zzhy0.zzd("measurement.upload.retry_count", 6L);
        zznp.zzK = zzhy0.zzd("measurement.upload.retry_time", 1800000L);
        zznp.zzL = zzhy0.zze("measurement.upload.url", "https://app-measurement.com/a");
        zznp.zzM = zzhy0.zzd("measurement.upload.window_interval", 3600000L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzA() {
        return (long)(((Long)zznp.zzF.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzB() {
        return (long)(((Long)zznp.zzG.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzC() {
        return (long)(((Long)zznp.zzH.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzD() {
        return (long)(((Long)zznp.zzI.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzE() {
        return (long)(((Long)zznp.zzJ.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzF() {
        return (long)(((Long)zznp.zzK.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzG() {
        return (long)(((Long)zznp.zzM.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final String zzH() {
        return (String)zznp.zze.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final String zzI() {
        return (String)zznp.zzf.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final String zzJ() {
        return (String)zznp.zzL.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zza() {
        return (long)(((Long)zznp.zza.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzb() {
        return (long)(((Long)zznp.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzc() {
        return (long)(((Long)zznp.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzd() {
        return (long)(((Long)zznp.zzg.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zze() {
        return (long)(((Long)zznp.zzh.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzf() {
        return (long)(((Long)zznp.zzi.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzg() {
        return (long)(((Long)zznp.zzj.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzh() {
        return (long)(((Long)zznp.zzk.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzi() {
        return (long)(((Long)zznp.zzl.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzj() {
        return (long)(((Long)zznp.zzm.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzk() {
        return (long)(((Long)zznp.zzn.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzl() {
        return (long)(((Long)zznp.zzo.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzm() {
        return (long)(((Long)zznp.zzp.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzn() {
        return (long)(((Long)zznp.zzr.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzo() {
        return (long)(((Long)zznp.zzt.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzp() {
        return (long)(((Long)zznp.zzu.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzq() {
        return (long)(((Long)zznp.zzv.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzr() {
        return (long)(((Long)zznp.zzw.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzs() {
        return (long)(((Long)zznp.zzx.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzt() {
        return (long)(((Long)zznp.zzy.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzu() {
        return (long)(((Long)zznp.zzz.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzv() {
        return (long)(((Long)zznp.zzA.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzw() {
        return (long)(((Long)zznp.zzB.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzx() {
        return (long)(((Long)zznp.zzC.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzy() {
        return (long)(((Long)zznp.zzD.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzno
    public final long zzz() {
        return (long)(((Long)zznp.zzE.zzb()));
    }
}

