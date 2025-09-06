package com.google.android.gms.internal.measurement;

public final class zzoe implements zzod {
    public static final zzib zza;

    static {
        zzoe.zza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza().zzf("measurement.audience.dynamic_filters.oob_fix", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzod
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzod
    public final boolean zzb() {
        return ((Boolean)zzoe.zza.zzb()).booleanValue();
    }
}

