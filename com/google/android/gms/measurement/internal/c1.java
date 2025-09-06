package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

public final class c1 implements Runnable {
    public final int a;
    public final zzjl b;

    public c1(zzjl zzjl0, int v) {
        this.a = v;
        this.b = zzjl0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.c.c = null;
            this.b.c.e();
            return;
        }
        ComponentName componentName0 = new ComponentName(this.b.c.zzt.zzau(), "com.google.android.gms.measurement.AppMeasurementService");
        zzjm.i(this.b.c, componentName0);
    }
}

