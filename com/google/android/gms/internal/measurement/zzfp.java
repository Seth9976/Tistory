package com.google.android.gms.internal.measurement;

public final class zzfp extends zzkf implements zzln {
    private static final zzfp zza;
    private int zzd;
    private int zze;
    private zzgi zzf;
    private zzgi zzg;
    private boolean zzh;

    static {
        zzfp zzfp0 = new zzfp();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkf;-><init>()V
        zzfp.zza = zzfp0;
        zzkf.zzbL(zzfp.class, zzfp0);
    }

    public static void h(zzfp zzfp0, int v) {
        zzfp0.zzd |= 1;
        zzfp0.zze = v;
    }

    public static void i(zzfp zzfp0, zzgi zzgi0) {
        zzgi0.getClass();
        zzfp0.zzf = zzgi0;
        zzfp0.zzd |= 2;
    }

    public static void j(zzfp zzfp0, zzgi zzgi0) {
        zzfp0.zzg = zzgi0;
        zzfp0.zzd |= 4;
    }

    public static void k(zzfp zzfp0, boolean z) {
        zzfp0.zzd |= 8;
        zzfp0.zzh = z;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzfo zzb() {
        return (zzfo)zzfp.zza.zzbx();
    }

    public final zzgi zzd() {
        return this.zzf == null ? zzgi.zzh() : this.zzf;
    }

    public final zzgi zze() {
        return this.zzg == null ? zzgi.zzh() : this.zzg;
    }

    public final boolean zzj() {
        return this.zzh;
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
                return zzkf.zzbI(zzfp.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzfp();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkf;-><init>()V
            }
            case 4: {
                return new zzfo(zzfp.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfp.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}

