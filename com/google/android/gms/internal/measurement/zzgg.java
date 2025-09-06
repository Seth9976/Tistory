package com.google.android.gms.internal.measurement;

public final class zzgg extends zzkf implements zzln {
    private static final zzgg zza;
    private int zzd;
    private int zze;
    private zzkm zzf;

    static {
        zzgg zzgg0 = new zzgg();
        zzgg.zza = zzgg0;
        zzkf.zzbL(zzgg.class, zzgg0);
    }

    public zzgg() {
        this.zze = 1;
        this.zzf = zzkf.zzbE();
    }

    public static void h(zzgg zzgg0, zzfv zzfv0) {
        zzfv0.getClass();
        zzkm zzkm0 = zzgg0.zzf;
        if(!zzkm0.zzc()) {
            zzgg0.zzf = zzkf.zzbF(zzkm0);
        }
        zzgg0.zzf.add(zzfv0);
    }

    public static zzge zza() {
        return (zzge)zzgg.zza.zzbx();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgg.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001B", new Object[]{"zzd", "zze", a0.e, "zzf", zzfv.class});
            }
            case 3: {
                return new zzgg();
            }
            case 4: {
                return new zzge(zzgg.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgg.zza;
            }
            default: {
                return null;
            }
        }
    }
}

