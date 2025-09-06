package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzkn {
    public static final Charset a;
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzji zzf;

    static {
        Charset.forName("US-ASCII");
        zzkn.a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzkn.zzd = arr_b;
        zzkn.zze = ByteBuffer.wrap(arr_b);
        r0 r00 = new r0();  // 初始化器: Ljava/lang/Object;-><init>()V
        int v = r00.a;
        r00.a = v > 0 ? v : 0;
        zzkn.zzf = r00;
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int zzb(byte[] arr_b) {
        int v1 = arr_b.length;
        for(int v = 0; v < arr_b.length; ++v) {
            v1 = v1 * 0x1F + arr_b[v];
        }
        return v1 == 0 ? 1 : v1;
    }

    public static int zzc(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String zzg(byte[] arr_b) {
        return new String(arr_b, zzkn.a);
    }

    public static boolean zzh(byte[] arr_b) {
        f2.a.getClass();
        return f.a(arr_b, 0, arr_b.length);
    }
}

