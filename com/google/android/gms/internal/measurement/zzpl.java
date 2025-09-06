package com.google.android.gms.internal.measurement;

public final class zzpl implements zzpk {
    public static final zzib zza;

    static {
        zzpl.zza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza().zzf("measurement.integration.disable_firebase_instance_id", false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpk
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpk
    public final boolean zzb() {
        return ((Boolean)zzpl.zza.zzb()).booleanValue();
    }
}

