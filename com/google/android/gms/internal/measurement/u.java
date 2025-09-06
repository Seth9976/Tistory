package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public final class u extends v {
    public final Long e;
    public final String f;
    public final String g;
    public final Bundle h;
    public final boolean i;
    public final boolean j;
    public final zzef k;

    public u(zzef zzef0, Long long0, String s, String s1, Bundle bundle0, boolean z, boolean z1) {
        this.k = zzef0;
        this.e = long0;
        this.f = s;
        this.g = s1;
        this.h = bundle0;
        this.i = z;
        this.j = z1;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.k.g)).logEvent(this.f, this.g, this.h, this.i, this.j, (this.e == null ? this.a : ((long)this.e)));
    }
}

