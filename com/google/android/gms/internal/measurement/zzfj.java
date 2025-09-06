package com.google.android.gms.internal.measurement;

public final class zzfj extends zzkf implements zzln {
    private static final zzfj zza;
    private int zzd;
    private String zze;
    private String zzf;

    static {
        zzfj zzfj0 = new zzfj();
        zzfj.zza = zzfj0;
        zzkf.zzbL(zzfj.class, zzfj0);
    }

    public zzfj() {
        this.zze = "";
        this.zzf = "";
    }

    public final String zzb() [...] // 潜在的解密器

    public final String zzc() [...] // 潜在的解密器

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfj.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzfj();
            }
            case 4: {
                return new zzfi(zzfj.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfj.zza;
            }
            default: {
                return null;
            }
        }
    }
}

