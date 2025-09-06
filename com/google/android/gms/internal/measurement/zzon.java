package com.google.android.gms.internal.measurement;

public final class zzon implements zzom {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zzon.zza = zzhy0.zzf("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzon.zzb = zzhy0.zzf("measurement.sdk.collection.last_deep_link_referrer2", true);
        zzon.zzc = zzhy0.zzf("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzon.zzd = zzhy0.zzd("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override  // com.google.android.gms.internal.measurement.zzom
    public final boolean zza() {
        return ((Boolean)zzon.zzc.zzb()).booleanValue();
    }
}

