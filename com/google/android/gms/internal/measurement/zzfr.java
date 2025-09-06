package com.google.android.gms.internal.measurement;

public final class zzfr extends zzkf implements zzln {
    private static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfr0 = new zzfr();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkf;-><init>()V
        zzfr.zza = zzfr0;
        zzkf.zzbL(zzfr.class, zzfr0);
    }

    public static void h(zzfr zzfr0, int v) {
        zzfr0.zzd |= 1;
        zzfr0.zze = v;
    }

    public static void i(zzfr zzfr0, long v) {
        zzfr0.zzd |= 2;
        zzfr0.zzf = v;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public static zzfq zzc() {
        return (zzfq)zzfr.zza.zzbx();
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfr.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzfr();  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkf;-><init>()V
            }
            case 4: {
                return new zzfq(zzfr.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfr.zza;
            }
            default: {
                return null;
            }
        }
    }
}

