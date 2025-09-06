package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

public final class w implements Callable {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final zzgj e;

    public w(zzgj zzgj0, String s, String s1, String s2, int v) {
        this.a = v;
        this.e = zzgj0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                this.e.a.a();
                return this.e.a.zzi().y(this.b, this.c, this.d);
            }
            case 1: {
                this.e.a.a();
                return this.e.a.zzi().y(this.b, this.c, this.d);
            }
            case 2: {
                this.e.a.a();
                return this.e.a.zzi().v(this.b, this.c, this.d);
            }
            default: {
                this.e.a.a();
                return this.e.a.zzi().v(this.b, this.c, this.d);
            }
        }
    }
}

