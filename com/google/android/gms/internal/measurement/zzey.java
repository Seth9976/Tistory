package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzey extends zzkf implements zzln {
    private static final zzey zza;
    private int zzd;
    private int zze;
    private String zzf;
    private boolean zzg;
    private zzkm zzh;

    static {
        zzey zzey0 = new zzey();
        zzey.zza = zzey0;
        zzkf.zzbL(zzey.class, zzey0);
    }

    public zzey() {
        this.zzf = "";
        this.zzh = zzkf.zzbE();
    }

    public final int zza() {
        return this.zzh.size();
    }

    public static zzey zzc() {
        return zzey.zza;
    }

    public final String zzd() [...] // 潜在的解密器

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int v = zzex.zza(this.zze);
        return v == 0 ? 1 : v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzey.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001A", new Object[]{"zzd", "zze", a0.c, "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzey();
            }
            case 4: {
                return new zzeu(zzey.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzey.zza;
            }
            default: {
                return null;
            }
        }
    }
}

