package com.google.android.gms.internal.measurement;

public final class zzer extends zzkf implements zzln {
    private static final zzer zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg;
    private String zzh;
    private String zzi;

    static {
        zzer zzer0 = new zzer();
        zzer.zza = zzer0;
        zzkf.zzbL(zzer.class, zzer0);
    }

    public zzer() {
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
    }

    public static zzer zzb() {
        return zzer.zza;
    }

    public final String zzc() [...] // 潜在的解密器

    public final String zzd() [...] // 潜在的解密器

    public final String zze() [...] // 潜在的解密器

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 8) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzer.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", a0.b, "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzer();
            }
            case 4: {
                return new zzen(zzer.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzer.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final int zzm() {
        int v = zzeq.zza(this.zze);
        return v == 0 ? 1 : v;
    }
}

