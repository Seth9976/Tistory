package com.google.android.gms.internal.measurement;

public final class zzfh extends zzkf implements zzln {
    private static final zzfh zza;
    private int zzd;
    private String zze;
    private String zzf;

    static {
        zzfh zzfh0 = new zzfh();
        zzfh.zza = zzfh0;
        zzkf.zzbL(zzfh.class, zzfh0);
    }

    public zzfh() {
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
                return zzkf.zzbI(zzfh.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzfh();
            }
            case 4: {
                return new zzfg(zzfh.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfh.zza;
            }
            default: {
                return null;
            }
        }
    }
}

