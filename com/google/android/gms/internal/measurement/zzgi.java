package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzgi extends zzkf implements zzln {
    private static final zzgi zza;
    private zzkl zzd;
    private zzkl zze;
    private zzkm zzf;
    private zzkm zzg;

    static {
        zzgi zzgi0 = new zzgi();
        zzgi.zza = zzgi0;
        zzkf.zzbL(zzgi.class, zzgi0);
    }

    public zzgi() {
        this.zzd = zzkf.zzbC();
        this.zze = zzkf.zzbC();
        this.zzf = zzkf.zzbE();
        this.zzg = zzkf.zzbE();
    }

    public static void h(zzgi zzgi0, Iterable iterable0) {
        zzkl zzkl0 = zzgi0.zzd;
        if(!zzkl0.zzc()) {
            zzgi0.zzd = zzkf.zzbD(zzkl0);
        }
        zzio.zzbt(iterable0, zzgi0.zzd);
    }

    public static void i(zzgi zzgi0) {
        zzgi0.zzd = zzkf.zzbC();
    }

    public static void j(zzgi zzgi0, Iterable iterable0) {
        zzkl zzkl0 = zzgi0.zze;
        if(!zzkl0.zzc()) {
            zzgi0.zze = zzkf.zzbD(zzkl0);
        }
        zzio.zzbt(iterable0, zzgi0.zze);
    }

    public static void k(zzgi zzgi0) {
        zzgi0.zze = zzkf.zzbC();
    }

    public static void l(zzgi zzgi0, Iterable iterable0) {
        zzkm zzkm0 = zzgi0.zzf;
        if(!zzkm0.zzc()) {
            zzgi0.zzf = zzkf.zzbF(zzkm0);
        }
        zzio.zzbt(iterable0, zzgi0.zzf);
    }

    public static void m(zzgi zzgi0) {
        zzgi0.zzf = zzkf.zzbE();
    }

    public static void n(zzgi zzgi0, int v) {
        zzkm zzkm0 = zzgi0.zzf;
        if(!zzkm0.zzc()) {
            zzgi0.zzf = zzkf.zzbF(zzkm0);
        }
        zzgi0.zzf.remove(v);
    }

    public static void o(zzgi zzgi0, Iterable iterable0) {
        zzkm zzkm0 = zzgi0.zzg;
        if(!zzkm0.zzc()) {
            zzgi0.zzg = zzkf.zzbF(zzkm0);
        }
        zzio.zzbt(iterable0, zzgi0.zzg);
    }

    public static void p(zzgi zzgi0) {
        zzgi0.zzg = zzkf.zzbE();
    }

    public static void q(zzgi zzgi0, int v) {
        zzkm zzkm0 = zzgi0.zzg;
        if(!zzkm0.zzc()) {
            zzgi0.zzg = zzkf.zzbF(zzkm0);
        }
        zzgi0.zzg.remove(v);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final zzfr zze(int v) {
        return (zzfr)this.zzf.get(v);
    }

    public static zzgh zzf() {
        return (zzgh)zzgi.zza.zzbx();
    }

    public static zzgi zzh() {
        return zzgi.zza;
    }

    public final zzgk zzi(int v) {
        return (zzgk)this.zzg.get(v);
    }

    public final List zzj() {
        return this.zzf;
    }

    public final List zzk() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzgi.zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001B\u0004\u001B", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzgk.class});
            }
            case 3: {
                return new zzgi();
            }
            case 4: {
                return new zzgh(zzgi.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzgi.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final List zzm() {
        return this.zzg;
    }

    public final List zzn() {
        return this.zzd;
    }
}

