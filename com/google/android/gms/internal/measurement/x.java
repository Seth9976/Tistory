package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgs;

public final class x extends zzch {
    public final zzgs a;

    public x(zzgs zzgs0) {
        this.a = zzgs0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final void zze(String s, String s1, Bundle bundle0, long v) {
        this.a.onEvent(s, s1, bundle0, v);
    }
}

