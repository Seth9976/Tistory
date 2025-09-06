package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

public final class zzfc implements Callable {
    public final zzfi zza;
    public final String zzb;

    public zzfc(zzfi zzfi0, String s) {
        this.zza = zzfi0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzn("internal.remoteConfig", new s(this.zza, this.zzb));
    }
}

