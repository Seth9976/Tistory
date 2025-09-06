package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

public final class k1 {
    public final Clock a;
    public long b;

    public k1(Clock clock0) {
        Preconditions.checkNotNull(clock0);
        this.a = clock0;
    }
}

