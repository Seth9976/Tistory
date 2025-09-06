package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import r0.a;

public abstract class zzje implements Serializable, Iterable {
    public int a;
    public static final zzje zzb;

    static {
        zzje.zzb = new q0(zzkn.zzd);
    }

    public abstract byte a(int arg1);

    public abstract void b(s0 arg1);

    public static int c(int v, int v1, int v2) {
        int v3 = v1 - v;
        if((v | v1 | v3 | v2 - v1) < 0) {
            if(v < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + v + " < 0");
            }
            throw v1 >= v ? new IndexOutOfBoundsException("End index: " + v1 + " >= " + v2) : new IndexOutOfBoundsException("Beginning index larger than ending index: " + v + ", " + v1);
        }
        return v3;
    }

    @Override
    public abstract boolean equals(Object arg1);

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = this.zzd();
            v = this.zze(v1, 0, v1);
            if(v == 0) {
                v = 1;
            }
            this.a = v;
        }
        return v;
    }

    @Override
    public final Iterator iterator() {
        return new o0(this);
    }

    @Override
    public final String toString() {
        int v = this.zzd();
        String s = this.zzd() > 50 ? n0.b(this.zzf(0, 0x2F)) + "..." : n0.b(this);
        StringBuilder stringBuilder0 = new StringBuilder("<ByteString@");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" size=");
        stringBuilder0.append(v);
        stringBuilder0.append(" contents=\"");
        return a.o(stringBuilder0, s, "\">");
    }

    public abstract byte zza(int arg1);

    public abstract int zzd();

    public abstract int zze(int arg1, int arg2, int arg3);

    public abstract zzje zzf(int arg1, int arg2);

    public abstract String zzg(Charset arg1);

    public abstract boolean zzi();

    public final int zzk() {
        return this.a;
    }

    public static zzje zzl(byte[] arr_b, int v, int v1) {
        zzje.c(v, v + v1, arr_b.length);
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return new q0(arr_b1);
    }

    public static zzje zzm(String s) {
        return new q0(s.getBytes(zzkn.a));
    }

    public final String zzn(Charset charset0) {
        return this.zzd() == 0 ? "" : this.zzg(charset0);
    }
}

