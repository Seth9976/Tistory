package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgk extends zzkf implements zzln {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzkl zzf;

    static {
        zzgk zzgk0 = new zzgk();
        zzgk.zza = zzgk0;
        zzkf.zzbL(zzgk.class, zzgk0);
    }

    public zzgk() {
        this.zzf = zzkf.zzbC();
    }

    public static void h(zzgk zzgk0, int v) {
        zzgk0.zzd |= 1;
        zzgk0.zze = v;
    }

    public static void i(zzgk zzgk0, Iterable iterable0) {
        zzkl zzkl0 = zzgk0.zzf;
        if(!zzkl0.zzc()) {
            zzgk0.zzf = zzkf.zzbD(zzkl0);
        }
        zzio.zzbt(iterable0, zzgk0.zzf);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int v) {
        return this.zzf.zza(v);
    }

    public static zzgj zzd() {
        return (zzgj)zzgk.zza.zzbx();
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgk.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgk();
            }
            case 4: {
                return new zzgj(zzgk.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgk.zza;
            }
            default: {
                return null;
            }
        }
    }
}

