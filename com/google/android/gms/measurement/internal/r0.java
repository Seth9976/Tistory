package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class r0 implements Runnable {
    public final int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public r0(Object object0, Object object1, Object object2, Object object3, long v, int v1) {
        this.a = v1;
        this.f = object0;
        this.c = object1;
        this.d = object2;
        this.e = object3;
        this.b = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ((Bundle)this.c).remove("screen_name");
                ((Bundle)this.c).remove("screen_class");
                Bundle bundle0 = ((zzim)this.f).zzt.zzv().L("screen_view", ((Bundle)this.c), null, false);
                ((zzim)this.f).a(((zzie)this.d), ((zzie)this.e), this.b, true, bundle0);
                return;
            }
            case 1: {
                String s = (String)this.d;
                zzgj zzgj0 = (zzgj)this.f;
                String s1 = (String)this.c;
                if(s1 == null) {
                    zzgj0.a.zzR(s, null);
                    return;
                }
                zzie zzie0 = new zzie(((String)this.e), s1, this.b);
                zzgj0.a.zzR(s, zzie0);
                return;
            }
            default: {
                ((zzhx)this.f).e(this.b, this.e, ((String)this.c), ((String)this.d));
            }
        }
    }
}

