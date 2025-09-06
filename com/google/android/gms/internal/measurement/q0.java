package com.google.android.gms.internal.measurement;

import androidx.room.a;
import java.nio.charset.Charset;

public class q0 extends zzje {
    public final byte[] b;

    public q0(byte[] arr_b) {
        this.a = 0;
        arr_b.getClass();
        this.b = arr_b;
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public byte a(int v) {
        return this.b[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final void b(s0 s00) {
        s00.b(this.zzd(), this.b);
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzje)) {
            return false;
        }
        if(this.zzd() != ((zzje)object0).zzd()) {
            return false;
        }
        if(this.zzd() == 0) {
            return true;
        }
        if(object0 instanceof q0) {
            int v = this.zzk();
            int v1 = ((q0)object0).zzk();
            if(v != 0 && v1 != 0 && v != v1) {
                return false;
            }
            int v2 = this.zzd();
            if(v2 > ((q0)object0).zzd()) {
                throw new IllegalArgumentException("Length too large: " + v2 + this.zzd());
            }
            if(v2 > ((q0)object0).zzd()) {
                throw new IllegalArgumentException(a.i(v2, ((q0)object0).zzd(), "Ran off end of other: 0, ", ", "));
            }
            int v3 = 0;
            for(int v4 = 0; v3 < v2; ++v4) {
                if(this.b[v3] != ((q0)object0).b[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public byte zza(int v) {
        return this.b[v];
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public int zzd() {
        return this.b.length;
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final int zze(int v, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            v = v * 0x1F + this.b[v3];
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final zzje zzf(int v, int v1) {
        int v2 = zzje.c(0, v1, this.zzd());
        return v2 == 0 ? zzje.zzb : new p0(this.b, v2);
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final String zzg(Charset charset0) {
        int v = this.zzd();
        return new String(this.b, 0, v, charset0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzje
    public final boolean zzi() {
        int v = this.zzd();
        f2.a.getClass();
        return f.a(this.b, 0, v);
    }
}

