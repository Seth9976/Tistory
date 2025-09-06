package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgr extends zzkf implements zzln {
    private static final zzgr zza;
    private int zzd;
    private String zze;
    private zzkm zzf;

    static {
        zzgr zzgr0 = new zzgr();
        zzgr.zza = zzgr0;
        zzkf.zzbL(zzgr.class, zzgr0);
    }

    public zzgr() {
        this.zze = "";
        this.zzf = zzkf.zzbE();
    }

    public final String zzb() [...] // 潜在的解密器

    public final List zzc() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgr.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001B", new Object[]{"zzd", "zze", "zzf", zzgy.class});
            }
            case 3: {
                return new zzgr();
            }
            case 4: {
                return new zzgq(zzgr.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgr.zza;
            }
            default: {
                return null;
            }
        }
    }
}

