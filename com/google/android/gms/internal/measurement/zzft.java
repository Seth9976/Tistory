package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzft extends zzkf implements zzln {
    private static final zzft zza;
    private int zzd;
    private zzkm zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzft0 = new zzft();
        zzft.zza = zzft0;
        zzkf.zzbL(zzft.class, zzft0);
    }

    public zzft() {
        this.zze = zzkf.zzbE();
        this.zzf = "";
    }

    public static void h(zzft zzft0, int v, zzfx zzfx0) {
        zzfx0.getClass();
        zzft0.p();
        zzft0.zze.set(v, zzfx0);
    }

    public static void i(zzft zzft0, zzfx zzfx0) {
        zzfx0.getClass();
        zzft0.p();
        zzft0.zze.add(zzfx0);
    }

    public static void j(zzft zzft0, Iterable iterable0) {
        zzft0.p();
        zzio.zzbt(iterable0, zzft0.zze);
    }

    public static void k(zzft zzft0) {
        zzft0.zze = zzkf.zzbE();
    }

    public static void l(zzft zzft0, int v) {
        zzft0.p();
        zzft0.zze.remove(v);
    }

    public static void m(zzft zzft0, String s) {
        s.getClass();
        zzft0.zzd |= 1;
        zzft0.zzf = s;
    }

    public static void n(long v, zzft zzft0) {
        zzft0.zzd |= 2;
        zzft0.zzg = v;
    }

    public static void o(long v, zzft zzft0) {
        zzft0.zzd |= 4;
        zzft0.zzh = v;
    }

    public final void p() {
        zzkm zzkm0 = this.zze;
        if(!zzkm0.zzc()) {
            this.zze = zzkf.zzbF(zzkm0);
        }
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public static zzfs zze() {
        return (zzfs)zzft.zza.zzbx();
    }

    public final zzfx zzg(int v) {
        return (zzfx)this.zze.get(v);
    }

    public final String zzh() [...] // 潜在的解密器

    public final List zzi() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzft.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001B\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzfx.class, "zzf", "zzg", "zzh", "zzi"});
            }
            case 3: {
                return new zzft();
            }
            case 4: {
                return new zzfs(zzft.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzft.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}

