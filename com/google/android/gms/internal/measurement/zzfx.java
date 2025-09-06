package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfx extends zzkf implements zzln {
    private static final zzfx zza;
    private int zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private float zzh;
    private double zzi;
    private zzkm zzj;

    static {
        zzfx zzfx0 = new zzfx();
        zzfx.zza = zzfx0;
        zzkf.zzbL(zzfx.class, zzfx0);
    }

    public zzfx() {
        this.zze = "";
        this.zzf = "";
        this.zzj = zzkf.zzbE();
    }

    public static void h(zzfx zzfx0, String s) {
        s.getClass();
        zzfx0.zzd |= 1;
        zzfx0.zze = s;
    }

    public static void i(zzfx zzfx0, String s) {
        s.getClass();
        zzfx0.zzd |= 2;
        zzfx0.zzf = s;
    }

    public static void j(zzfx zzfx0) {
        zzfx0.zzd &= -3;
        zzfx0.zzf = zzfx.zza.zzf;
    }

    public static void k(zzfx zzfx0, long v) {
        zzfx0.zzd |= 4;
        zzfx0.zzg = v;
    }

    public static void l(zzfx zzfx0) {
        zzfx0.zzd &= -5;
        zzfx0.zzg = 0L;
    }

    public static void m(zzfx zzfx0, double f) {
        zzfx0.zzd |= 16;
        zzfx0.zzi = f;
    }

    public static void n(zzfx zzfx0) {
        zzfx0.zzd &= -17;
        zzfx0.zzi = 0.0;
    }

    public static void o(zzfx zzfx0, zzfx zzfx1) {
        zzfx1.getClass();
        zzkm zzkm0 = zzfx0.zzj;
        if(!zzkm0.zzc()) {
            zzfx0.zzj = zzkf.zzbF(zzkm0);
        }
        zzfx0.zzj.add(zzfx1);
    }

    public static void p(zzfx zzfx0, Iterable iterable0) {
        zzkm zzkm0 = zzfx0.zzj;
        if(!zzkm0.zzc()) {
            zzfx0.zzj = zzkf.zzbF(zzkm0);
        }
        zzio.zzbt(iterable0, zzfx0.zzj);
    }

    public static void q(zzfx zzfx0) {
        zzfx0.zzj = zzkf.zzbE();
    }

    public final double zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzh;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final long zzd() {
        return this.zzg;
    }

    public static zzfw zze() {
        return (zzfw)zzfx.zza.zzbx();
    }

    public final String zzg() [...] // 潜在的解密器

    public final String zzh() [...] // 潜在的解密器

    public final List zzi() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfx.zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001B", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfx.class});
            }
            case 3: {
                return new zzfx();
            }
            case 4: {
                return new zzfw(zzfx.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfx.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final boolean zzu() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zzd & 2) != 0;
    }
}

