package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class r extends v {
    public final zzbz e;
    public final int f;
    public final zzef g;

    public r(zzef zzef0, zzbz zzbz0, int v) {
        this.g = zzef0;
        this.e = zzbz0;
        this.f = v;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.g.g)).getTestFlag(this.e, this.f);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void b() {
        this.e.zze(null);
    }
}

