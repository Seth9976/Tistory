package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgp extends zzkf implements zzln {
    private static final zzgp zza;
    private zzkm zzd;

    static {
        zzgp zzgp0 = new zzgp();
        zzgp.zza = zzgp0;
        zzkf.zzbL(zzgp.class, zzgp0);
    }

    public zzgp() {
        this.zzd = zzkf.zzbE();
    }

    public final int zza() {
        return this.zzd.size();
    }

    public static zzgp zzc() {
        return zzgp.zza;
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
                return zzkf.zzbI(zzgp.zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"zzd", zzgr.class});
            }
            case 3: {
                return new zzgp();
            }
            case 4: {
                return new zzgo(zzgp.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgp.zza;
            }
            default: {
                return null;
            }
        }
    }
}

