package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;

public final class c implements BaseConnectionCallbacks {
    public final ConnectionCallbacks a;

    public c(ConnectionCallbacks connectionCallbacks0) {
        this.a = connectionCallbacks0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        this.a.onConnected(bundle0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        this.a.onConnectionSuspended(v);
    }
}

