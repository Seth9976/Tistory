package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgt extends zzkf implements zzln {
    private static final zzgt zza;
    private int zzd;
    private zzkm zze;
    private zzgp zzf;

    static {
        zzgt zzgt0 = new zzgt();
        zzgt.zza = zzgt0;
        zzkf.zzbL(zzgt.class, zzgt0);
    }

    public zzgt() {
        this.zze = zzkf.zzbE();
    }

    public final zzgp zza() {
        return this.zzf == null ? zzgp.zzc() : this.zzf;
    }

    public final List zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgt.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzgy.class, "zzf"});
            }
            case 3: {
                return new zzgt();
            }
            case 4: {
                return new zzgs(zzgt.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgt.zza;
            }
            default: {
                return null;
            }
        }
    }
}

