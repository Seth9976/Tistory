package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

public final class y implements Callable {
    public final zzgj a;

    public y(zzgj zzgj0, zzaw zzaw0, String s) {
        this.a = zzgj0;
    }

    @Override
    public final Object call() {
        this.a.a.a();
        this.a.a.zzr().zzg();
        throw new IllegalStateException("Unexpected call on client side");
    }
}

