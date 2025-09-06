package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class zzjm extends zziu {
    public t0 a;
    public static final Logger b;
    public static final boolean c;

    static {
        zzjm.b = Logger.getLogger("com.google.android.gms.internal.measurement.zzjm");
        zzjm.c = d2.e;
    }

    public static int a(int v, zzlm zzlm0, zzlx zzlx0) {
        int v1 = zzjm.zzA(v << 3);
        return ((zzio)zzlm0).a(zzlx0) + (v1 + v1);
    }

    public static int zzA(int v) [...] // 潜在的解密器

    public static int zzB(long v) {
        int v1;
        if(Long.compare(0xFFFFFFFFFFFFFF80L & v, 0L) == 0) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public static zzjm zzC(byte[] arr_b) {
        return new s0(arr_b, arr_b.length);
    }

    public final void zzD() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte arg1) throws IOException;

    public abstract void zzd(int arg1, boolean arg2) throws IOException;

    public abstract void zze(int arg1, zzje arg2) throws IOException;

    public abstract void zzf(int arg1, int arg2) throws IOException;

    public abstract void zzg(int arg1) throws IOException;

    public abstract void zzh(int arg1, long arg2) throws IOException;

    public abstract void zzi(long arg1) throws IOException;

    public abstract void zzj(int arg1, int arg2) throws IOException;

    public abstract void zzk(int arg1) throws IOException;

    public abstract void zzl(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void zzm(int arg1, String arg2) throws IOException;

    public abstract void zzo(int arg1, int arg2) throws IOException;

    public abstract void zzp(int arg1, int arg2) throws IOException;

    public abstract void zzq(int arg1) throws IOException;

    public abstract void zzr(int arg1, long arg2) throws IOException;

    public abstract void zzs(long arg1) throws IOException;

    public static int zzt(zzje zzje0) {
        int v = zzje0.zzd();
        return zzjm.zzA(v) + v;
    }

    public static int zzv(int v) {
        return v < 0 ? 10 : zzjm.zzA(v);
    }

    public static int zzw(zzks zzks0) {
        int v = zzks0.zza();
        return zzjm.zzA(v) + v;
    }

    public static int zzy(String s) {
        int v;
        try {
            v = f2.c(s);
            return zzjm.zzA(v) + v;
        }
        catch(e2 unused_ex) {
            v = s.getBytes(zzkn.a).length;
            return zzjm.zzA(v) + v;
        }
    }

    public static int zzz(int v) {
        return zzjm.zzA(v << 3);
    }
}

