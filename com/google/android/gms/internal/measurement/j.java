package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

public final class j extends v {
    public final int e;
    public final zzef f;
    public final Object g;

    public j(zzef zzef0, Object object0, int v) {
        this.e = v;
        this.f = zzef0;
        this.g = object0;
        super(zzef0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.v
    public final void a() {
        if(this.e != 0) {
            ((zzcc)Preconditions.checkNotNull(this.f.g)).setEventInterceptor(((w)this.g));
            return;
        }
        if(((Boolean)this.g) != null) {
            ((zzcc)Preconditions.checkNotNull(this.f.g)).setMeasurementEnabled(((Boolean)this.g).booleanValue(), this.a);
            return;
        }
        ((zzcc)Preconditions.checkNotNull(this.f.g)).clearMeasurementEnabled(this.a);
    }
}

