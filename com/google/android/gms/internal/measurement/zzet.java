package com.google.android.gms.internal.measurement;

public final class zzet extends zzkf implements zzln {
    private static final zzet zza;
    private int zzd;
    private int zze;
    private String zzf;
    private zzem zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzet zzet0 = new zzet();
        zzet.zza = zzet0;
        zzkf.zzbL(zzet.class, zzet0);
    }

    public zzet() {
        this.zzf = "";
    }

    public static void h(zzet zzet0, String s) {
        zzet0.zzd |= 2;
        zzet0.zzf = s;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzem zzb() {
        return this.zzg == null ? zzem.zzb() : this.zzg;
    }

    public static zzes zzc() {
        return (zzes)zzet.zza.zzbx();
    }

    public final String zze() [...] // 潜在的解密器

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 0x20) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzet.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
            }
            case 3: {
                return new zzet();
            }
            case 4: {
                return new zzes(zzet.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzet.zza;
            }
            default: {
                return null;
            }
        }
    }
}

