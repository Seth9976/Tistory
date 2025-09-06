package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class t extends v {
    public final int e;
    public final x f;
    public final zzef g;

    public t(zzef zzef0, x x0, int v) {
        this.e = v;
        this.g = zzef0;
        this.f = x0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        if(this.e != 0) {
            ((zzcc)Preconditions.checkNotNull(this.g.g)).unregisterOnMeasurementEventListener(this.f);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.g.g)).registerOnMeasurementEventListener(this.f);
    }
}

