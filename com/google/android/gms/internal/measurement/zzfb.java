package com.google.android.gms.internal.measurement;

public final class zzfb extends zzkf implements zzln {
    private static final zzfb zza;
    private int zzd;
    private String zze;
    private zzkm zzf;
    private boolean zzg;

    static {
        zzfb zzfb0 = new zzfb();
        zzfb.zza = zzfb0;
        zzkf.zzbL(zzfb.class, zzfb0);
    }

    public zzfb() {
        this.zze = "";
        this.zzf = zzkf.zzbE();
    }

    public final String zzb() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfb.zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zzfh.class, "zzg"});
            }
            case 3: {
                return new zzfb();
            }
            case 4: {
                return new zzfa(zzfb.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfb.zza;
            }
            default: {
                return null;
            }
        }
    }
}

