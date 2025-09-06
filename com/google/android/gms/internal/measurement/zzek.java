package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzek extends zzkf implements zzln {
    private static final zzek zza;
    private int zzd;
    private int zze;
    private String zzf;
    private zzkm zzg;
    private boolean zzh;
    private zzer zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzek zzek0 = new zzek();
        zzek.zza = zzek0;
        zzkf.zzbL(zzek.class, zzek0);
    }

    public zzek() {
        this.zzf = "";
        this.zzg = zzkf.zzbE();
    }

    public static void h(zzek zzek0, String s) {
        zzek0.zzd |= 2;
        zzek0.zzf = s;
    }

    public static void i(zzek zzek0, int v, zzem zzem0) {
        zzem0.getClass();
        zzkm zzkm0 = zzek0.zzg;
        if(!zzkm0.zzc()) {
            zzek0.zzg = zzkf.zzbF(zzkm0);
        }
        zzek0.zzg.set(v, zzem0);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public static zzej zzc() {
        return (zzej)zzek.zza.zzbx();
    }

    public final zzem zze(int v) {
        return (zzem)this.zzg.get(v);
    }

    public final zzer zzf() {
        return this.zzi == null ? zzer.zzb() : this.zzi;
    }

    public final String zzg() [...] // 潜在的解密器

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzek.zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001B\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzem.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
            }
            case 3: {
                return new zzek();
            }
            case 4: {
                return new zzej(zzek.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzek.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final boolean zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return this.zzl;
    }

    public final boolean zzo() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 0x40) != 0;
    }
}

