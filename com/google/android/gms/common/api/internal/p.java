package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import java.util.concurrent.atomic.AtomicReference;

public final class p implements ConnectionCallbacks {
    public final AtomicReference a;
    public final StatusPendingResult b;
    public final zabe c;

    public p(zabe zabe0, AtomicReference atomicReference0, StatusPendingResult statusPendingResult0) {
        this.c = zabe0;
        this.a = atomicReference0;
        this.b = statusPendingResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        GoogleApiClient googleApiClient0 = (GoogleApiClient)Preconditions.checkNotNull(((GoogleApiClient)this.a.get()));
        this.c.getClass();
        Common.zaa.zaa(googleApiClient0).setResultCallback(new r(this.c, this.b, true, googleApiClient0));
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }
}

