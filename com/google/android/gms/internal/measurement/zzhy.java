package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class zzhy {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public zzhy(Uri uri0) {
        this(uri0, false, false);
    }

    public zzhy(Uri uri0, boolean z, boolean z1) {
        this.a = uri0;
        this.b = "";
        this.c = "";
        this.d = z;
        this.e = z1;
    }

    public final zzhy zza() {
        return new zzhy(this.a, this.d, true);
    }

    public final zzhy zzb() {
        if(!this.b.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzhy(this.a, true, this.e);
    }

    public final zzib zzc(String s, double f) {
        return new e0(this, "measurement.test.double_flag", -3.0, 2);
    }

    public final zzib zzd(String s, long v) {
        return new e0(this, s, v, 0);
    }

    public final zzib zze(String s, String s1) {
        return new e0(this, s, s1, 3);
    }

    public final zzib zzf(String s, boolean z) {
        return new e0(this, s, Boolean.valueOf(z), 1);
    }
}

