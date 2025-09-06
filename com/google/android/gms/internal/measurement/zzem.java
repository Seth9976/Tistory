package com.google.android.gms.internal.measurement;

public final class zzem extends zzkf implements zzln {
    private static final zzem zza;
    private int zzd;
    private zzey zze;
    private zzer zzf;
    private boolean zzg;
    private String zzh;

    static {
        zzem zzem0 = new zzem();
        zzem.zza = zzem0;
        zzkf.zzbL(zzem.class, zzem0);
    }

    public zzem() {
        this.zzh = "";
    }

    public static void h(zzem zzem0, String s) {
        zzem0.zzd |= 8;
        zzem0.zzh = s;
    }

    public static zzem zzb() {
        return zzem.zza;
    }

    public final zzer zzc() {
        return this.zzf == null ? zzer.zzb() : this.zzf;
    }

    public final zzey zzd() {
        return this.zze == null ? zzey.zzc() : this.zze;
    }

    public final String zze() [...] // 潜在的解密器

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 8) != 0;
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
                return zzkf.zzbI(zzem.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzem();
            }
            case 4: {
                return new zzel(zzem.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzem.zza;
            }
            default: {
                return null;
            }
        }
    }
}

