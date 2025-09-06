package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

public final class s0 extends zzjm {
    public final byte[] d;
    public final int e;
    public int f;

    public s0(byte[] arr_b, int v) {
        if(arr_b == null) {
            throw new NullPointerException("buffer");
        }
        if((arr_b.length - v | v) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", ((int)arr_b.length), 0, v));
        }
        this.d = arr_b;
        this.f = 0;
        this.e = v;
    }

    public final void b(int v, byte[] arr_b) {
        try {
            System.arraycopy(arr_b, 0, this.d, this.f, v);
            this.f += v;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, v), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final int zza() {
        return this.e - this.f;
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzb(byte b) {
        try {
            int v = this.f;
            this.f = v + 1;
            this.d[v] = b;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzd(int v, boolean z) {
        this.zzq(v << 3);
        this.zzb(((byte)z));
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zze(int v, zzje zzje0) {
        this.zzq(v << 3 | 2);
        this.zzq(zzje0.zzd());
        zzje0.b(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzf(int v, int v1) {
        this.zzq(v << 3 | 5);
        this.zzg(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzg(int v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(v & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(v >> 24 & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzh(int v, long v1) {
        this.zzq(v << 3 | 1);
        this.zzi(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzi(long v) {
        try {
            int v1 = this.f;
            this.f = v1 + 1;
            this.d[v1] = (byte)(((int)v) & 0xFF);
            this.f = v1 + 2;
            this.d[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.f = v1 + 3;
            this.d[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.f = v1 + 4;
            this.d[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.f = v1 + 5;
            this.d[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.f = v1 + 6;
            this.d[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.f = v1 + 7;
            this.d[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.f = v1 + 8;
            this.d[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzj(int v, int v1) {
        this.zzq(v << 3);
        this.zzk(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzk(int v) {
        if(v >= 0) {
            this.zzq(v);
            return;
        }
        this.zzs(((long)v));
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzl(byte[] arr_b, int v, int v1) {
        this.b(v1, arr_b);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzm(int v, String s) {
        e2 e21;
        this.zzq(v << 3 | 2);
        int v1 = this.f;
        try {
            int v2 = zzjm.zzA(s.length());
            int v3 = this.e;
            byte[] arr_b = this.d;
            if(v2 == zzjm.zzA(s.length() * 3)) {
                int v4 = v1 + v2;
                this.f = v4;
                int v5 = f2.b(s, arr_b, v4, v3 - v4);
                this.f = v1;
                this.zzq(v5 - v1 - v2);
                this.f = v5;
                return;
            }
            this.zzq(f2.c(s));
            this.f = f2.b(s, arr_b, this.f, v3 - this.f);
            return;
        label_19:
            e21 = e20;
        }
        catch(e2 e20) {
            goto label_19;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzjk(indexOutOfBoundsException0);
        }
        this.f = v1;
        zzjm.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e21);
        byte[] arr_b1 = s.getBytes(zzkn.a);
        try {
            this.zzq(arr_b1.length);
            this.b(arr_b1.length, arr_b1);
            return;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
            throw new zzjk(indexOutOfBoundsException1);
        }
        throw new zzjk(indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzo(int v, int v1) {
        this.zzq(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzp(int v, int v1) {
        this.zzq(v << 3);
        this.zzq(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzq(int v) {
        try {
            while(true) {
                byte[] arr_b = this.d;
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.f;
                    this.f = v1 + 1;
                    arr_b[v1] = (byte)v;
                    return;
                }
                int v2 = this.f;
                this.f = v2 + 1;
                arr_b[v2] = (byte)(v & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, this.e, 1), indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzr(int v, long v1) {
        this.zzq(v << 3);
        this.zzs(v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzjm
    public final void zzs(long v) {
        int v1 = this.e;
        byte[] arr_b = this.d;
        if(zzjm.c && v1 - this.f >= 10) {
            while((v & 0xFFFFFFFFFFFFFF80L) != 0L) {
                int v2 = this.f;
                this.f = v2 + 1;
                d2.c.d(arr_b, d2.f + ((long)v2), ((byte)(((int)v) & 0x7F | 0x80)));
                v >>>= 7;
            }
            int v3 = this.f;
            this.f = v3 + 1;
            d2.c.d(arr_b, d2.f + ((long)v3), ((byte)(((int)v))));
            return;
        }
        try {
            while(true) {
                if((v & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v4 = this.f;
                    this.f = v4 + 1;
                    arr_b[v4] = (byte)(((int)v));
                    return;
                }
                int v5 = this.f;
                this.f = v5 + 1;
                arr_b[v5] = (byte)(((int)v) & 0x7F | 0x80);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
        }
        throw new zzjk(String.format("Pos: %d, limit: %d, len: %d", this.f, v1, 1), indexOutOfBoundsException0);
    }
}

