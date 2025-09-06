package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzt;
import java.util.concurrent.Callable;

public final class zzfe implements Callable {
    public final zzfi zza;

    public zzfe(zzfi zzfi0) {
        this.zza = zzfi0;
    }

    @Override
    public final Object call() {
        return new zzt(this.zza.i);
    }
}

