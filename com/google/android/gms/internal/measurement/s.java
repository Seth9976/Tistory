package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class s extends v {
    public final boolean e;
    public final zzef f;

    public s(zzef zzef0, boolean z) {
        this.f = zzef0;
        this.e = z;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        ((zzcc)Preconditions.checkNotNull(this.f.g)).setDataCollectionEnabled(this.e);
    }
}

