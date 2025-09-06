package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzu;
import java.util.concurrent.Callable;

public final class zzfd implements Callable {
    public final zzfi zza;
    public final String zzb;

    public zzfd(zzfi zzfi0, String s) {
        this.zza = zzfi0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return new zzu("internal.appMetadata", new zzfb(this.zza, this.zzb));
    }
}

