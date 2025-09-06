package com.google.android.gms.internal.measurement;

public final class zzny implements zznx {
    public static final zzib zza;

    static {
        zzny.zza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza().zzf("measurement.client.firebase_feature_rollout.v1.enable", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zznx
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb() {
        return ((Boolean)zzny.zza.zzb()).booleanValue();
    }
}

