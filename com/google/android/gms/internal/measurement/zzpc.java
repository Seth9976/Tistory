package com.google.android.gms.internal.measurement;

public final class zzpc implements zzpb {
    public static final zzib zza;

    static {
        zzpc.zza = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zzb().zza().zzf("measurement.sessionid.enable_client_session_id", true);
    }

    @Override  // com.google.android.gms.internal.measurement.zzpb
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzpb
    public final boolean zzb() {
        return ((Boolean)zzpc.zza.zzb()).booleanValue();
    }
}

