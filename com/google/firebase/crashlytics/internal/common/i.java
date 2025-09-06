package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Callable;

public final class i implements Callable {
    public final long a;
    public final String b;
    public final l c;

    public i(l l0, long v, String s) {
        this.c = l0;
        this.a = v;
        this.b = s;
    }

    @Override
    public final Object call() {
        l l0 = this.c;
        if(l0.m == null || !l0.m.e.get()) {
            l0.i.writeToLog(this.a, this.b);
        }
        return null;
    }
}

