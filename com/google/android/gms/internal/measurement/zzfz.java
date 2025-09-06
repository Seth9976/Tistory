package com.google.android.gms.internal.measurement;

public final class zzfz extends zzkf implements zzln {
    private static final zzfz zza;
    private int zzd;
    private String zze;
    private String zzf;
    private zzfn zzg;

    static {
        zzfz zzfz0 = new zzfz();
        zzfz.zza = zzfz0;
        zzkf.zzbL(zzfz.class, zzfz0);
    }

    public zzfz() {
        this.zze = "";
        this.zzf = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfz.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfz();
            }
            case 4: {
                return new zzfy(zzfz.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfz.zza;
            }
            default: {
                return null;
            }
        }
    }
}

