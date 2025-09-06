package com.google.android.gms.internal.measurement;

public final class zzoh implements zzog {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zzoh.zza = zzhy0.zzf("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzoh.zzb = zzhy0.zzf("measurement.client.sessions.check_on_startup", true);
        zzoh.zzc = zzhy0.zzf("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzog
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzog
    public final boolean zzb() {
        return ((Boolean)zzoh.zza.zzb()).booleanValue();
    }
}

