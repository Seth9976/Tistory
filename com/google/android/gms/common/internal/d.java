package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;

public final class d implements BaseOnConnectionFailedListener {
    public final OnConnectionFailedListener a;

    public d(OnConnectionFailedListener onConnectionFailedListener0) {
        this.a = onConnectionFailedListener0;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.a.onConnectionFailed(connectionResult0);
    }
}

