package com.google.android.gms.internal.measurement;

public final class zzot implements zzos {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;

    static {
        zzhy zzhy0 = new zzhy(zzhq.zza("com.google.android.gms.measurement")).zza();
        zzot.zza = zzhy0.zzf("measurement.test.boolean_flag", false);
        zzot.zzb = zzhy0.zzc("measurement.test.double_flag", -3.0);
        zzot.zzc = zzhy0.zzd("measurement.test.int_flag", -2L);
        zzot.zzd = zzhy0.zzd("measurement.test.long_flag", -1L);
        zzot.zze = zzhy0.zze("measurement.test.string_flag", "---");
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final double zza() {
        return (double)(((Double)zzot.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final long zzb() {
        return (long)(((Long)zzot.zzc.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final long zzc() {
        return (long)(((Long)zzot.zzd.zzb()));
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final String zzd() {
        return (String)zzot.zze.zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzos
    public final boolean zze() {
        return ((Boolean)zzot.zza.zzb()).booleanValue();
    }
}

