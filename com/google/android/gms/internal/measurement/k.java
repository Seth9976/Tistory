package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class k extends v {
    public final zzef e;

    public k(zzef zzef0) {
        this.e = zzef0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.e.g)).resetAnalyticsData(this.a);
    }
}

