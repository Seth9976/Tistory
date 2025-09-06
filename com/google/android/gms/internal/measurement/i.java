package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class i extends v {
    public final int e;
    public final String f;
    public final zzef g;

    public i(zzef zzef0, String s, int v) {
        this.e = v;
        this.g = zzef0;
        this.f = s;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        switch(this.e) {
            case 0: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).setUserId(this.f, this.a);
                return;
            }
            case 1: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).beginAdUnitExposure(this.f, this.b);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(this.g.g)).endAdUnitExposure(this.f, this.b);
            }
        }
    }
}

