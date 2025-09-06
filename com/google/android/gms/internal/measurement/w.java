package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgr;

public final class w extends zzch {
    public final zzgr a;

    public w(zzgr zzgr0) {
        this.a = zzgr0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.a);
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final void zze(String s, String s1, Bundle bundle0, long v) {
        this.a.interceptEvent(s, s1, bundle0, v);
    }
}

