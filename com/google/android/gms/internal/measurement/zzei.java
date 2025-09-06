package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzei extends zzkf implements zzln {
    private static final zzei zza;
    private int zzd;
    private int zze;
    private zzkm zzf;
    private zzkm zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzei0 = new zzei();
        zzei.zza = zzei0;
        zzkf.zzbL(zzei.class, zzei0);
    }

    public zzei() {
        this.zzf = zzkf.zzbE();
        this.zzg = zzkf.zzbE();
    }

    public static void h(zzei zzei0, int v, zzet zzet0) {
        zzet0.getClass();
        zzkm zzkm0 = zzei0.zzf;
        if(!zzkm0.zzc()) {
            zzei0.zzf = zzkf.zzbF(zzkm0);
        }
        zzei0.zzf.set(v, zzet0);
    }

    public static void i(zzei zzei0, int v, zzek zzek0) {
        zzek0.getClass();
        zzkm zzkm0 = zzei0.zzg;
        if(!zzkm0.zzc()) {
            zzei0.zzg = zzkf.zzbF(zzkm0);
        }
        zzei0.zzg.set(v, zzek0);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzek zze(int v) {
        return (zzek)this.zzg.get(v);
    }

    public final zzet zzf(int v) {
        return (zzet)this.zzf.get(v);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzei.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001B\u0003\u001B\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzet.class, "zzg", zzek.class, "zzh", "zzi"});
            }
            case 3: {
                return new zzei();
            }
            case 4: {
                return new zzeh(zzei.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzei.zza;
            }
            default: {
                return null;
            }
        }
    }
}

