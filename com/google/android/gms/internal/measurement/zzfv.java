package com.google.android.gms.internal.measurement;

public final class zzfv extends zzkf implements zzln {
    private static final zzfv zza;
    private int zzd;
    private String zze;
    private long zzf;

    static {
        zzfv zzfv0 = new zzfv();
        zzfv.zza = zzfv0;
        zzkf.zzbL(zzfv.class, zzfv0);
    }

    public zzfv() {
        this.zze = "";
    }

    public static void h(zzfv zzfv0, String s) {
        s.getClass();
        zzfv0.zzd |= 1;
        zzfv0.zze = s;
    }

    public static void i(zzfv zzfv0, long v) {
        zzfv0.zzd |= 2;
        zzfv0.zzf = v;
    }

    public static zzfu zza() {
        return (zzfu)zzfv.zza.zzbx();
    }

    @Override  // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int v, Object object0, Object object1) {
        switch(v - 1) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzkf.zzbI(zzfv.zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzfv();
            }
            case 4: {
                return new zzfu(zzfv.zza);  // 初始化器: Lcom/google/android/gms/internal/measurement/zzkb;-><init>(Lcom/google/android/gms/internal/measurement/zzkf;)V
            }
            case 5: {
                return zzfv.zza;
            }
            default: {
                return null;
            }
        }
    }
}

