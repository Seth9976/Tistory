package com.google.android.gms.internal.measurement;

public final class zzfn extends zzkf implements zzln {
    private static final zzfn zza;
    private int zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;

    static {
        zzfn zzfn0 = new zzfn();
        zzfn.zza = zzfn0;
        zzkf.zzbL(zzfn.class, zzfn0);
    }

    public zzfn() {
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfn.zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            }
            case 3: {
                return new zzfn();
            }
            case 4: {
                return new zzfm(zzfn.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfn.zza;
            }
            default: {
                return null;
            }
        }
    }
}

