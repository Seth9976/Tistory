package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzff extends zzkf implements zzln {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private String zzf;
    private int zzg;
    private zzkm zzh;
    private zzkm zzi;
    private zzkm zzj;
    private String zzk;
    private boolean zzl;
    private zzkm zzm;
    private zzkm zzn;
    private String zzo;

    static {
        zzff zzff0 = new zzff();
        zzff.zza = zzff0;
        zzkf.zzbL(zzff.class, zzff0);
    }

    public zzff() {
        this.zzf = "";
        this.zzh = zzkf.zzbE();
        this.zzi = zzkf.zzbE();
        this.zzj = zzkf.zzbE();
        this.zzk = "";
        this.zzm = zzkf.zzbE();
        this.zzn = zzkf.zzbE();
        this.zzo = "";
    }

    public static void h(zzff zzff0, int v, zzfd zzfd0) {
        zzfd0.getClass();
        zzkm zzkm0 = zzff0.zzi;
        if(!zzkm0.zzc()) {
            zzff0.zzi = zzkf.zzbF(zzkm0);
        }
        zzff0.zzi.set(v, zzfd0);
    }

    public static void i(zzff zzff0) {
        zzff0.zzj = zzkf.zzbE();
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int v) {
        return (zzfd)this.zzi.get(v);
    }

    public static zzfe zze() {
        return (zzfe)zzff.zza.zzbx();
    }

    public static zzff zzg() {
        return zzff.zza;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzo;
    }

    public final List zzj() {
        return this.zzj;
    }

    public final List zzk() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzff.zza, "\u0001\u000B\u0000\u0001\u0001\u000B\u000B\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001B\u0005\u001B\u0006\u001B\u0007ဈ\u0003\bဇ\u0004\t\u001B\n\u001B\u000Bဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo"});
            }
            case 3: {
                return new zzff();
            }
            case 4: {
                return new zzfe(zzff.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzff.zza;
            }
            default: {
                return null;
            }
        }
    }

    public final List zzm() {
        return this.zzm;
    }

    public final List zzn() {
        return this.zzh;
    }

    public final boolean zzq() {
        return this.zzl;
    }

    public final boolean zzr() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzs() {
        return (this.zzd & 1) != 0;
    }
}

