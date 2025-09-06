package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

public final class o1 {
    public final g1 a;
    public final ConcurrentHashMap b;
    public static final o1 c;

    static {
        o1.c = new o1();
    }

    public o1() {
        this.b = new ConcurrentHashMap();
        this.a = new g1();
    }

    public final zzlx a(Class class0) {
        if(class0 == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap0 = this.b;
        zzlx zzlx0 = (zzlx)concurrentHashMap0.get(class0);
        if(zzlx0 == null) {
            zzlx0 = this.a.zza(class0);
            zzlx zzlx1 = (zzlx)concurrentHashMap0.putIfAbsent(class0, zzlx0);
            return zzlx1 == null ? zzlx0 : zzlx1;
        }
        return zzlx0;
    }
}

