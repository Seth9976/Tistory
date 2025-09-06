package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public final class j0 {
    public final int a;
    public final ConnectionResult b;

    public j0(ConnectionResult connectionResult0, int v) {
        Preconditions.checkNotNull(connectionResult0);
        this.b = connectionResult0;
        this.a = v;
    }
}

