package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class e0 implements Runnable {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final zzhx i;

    public e0(zzhx zzhx0, String s, String s1, long v, Bundle bundle0, boolean z, boolean z1, boolean z2, String s2) {
        this.i = zzhx0;
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = bundle0;
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = s2;
    }

    @Override
    public final void run() {
        this.i.zzI(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}

