package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgb extends zzkf implements zzln {
    private static final zzgb zza;
    private zzkm zzd;

    static {
        zzgb zzgb0 = new zzgb();
        zzgb.zza = zzgb0;
        zzkf.zzbL(zzgb.class, zzgb0);
    }

    public zzgb() {
        this.zzd = zzkf.zzbE();
    }

    public static void h(zzgb zzgb0, zzgd zzgd0) {
        zzgd0.getClass();
        zzkm zzkm0 = zzgb0.zzd;
        if(!zzkm0.zzc()) {
            zzgb0.zzd = zzkf.zzbF(zzkm0);
        }
        zzgb0.zzd.add(zzgd0);
    }

    public static zzga zza() {
        return (zzga)zzgb.zza.zzbx();
    }

    public final zzgd zzc(int v) {
        return (zzgd)this.zzd.get(0);
    }

    public final List zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgb.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzgd.class});
            }
            case 3: {
                return new zzgb();
            }
            case 4: {
                return new zzga(zzgb.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgb.zza;
            }
            default: {
                return null;
            }
        }
    }
}

