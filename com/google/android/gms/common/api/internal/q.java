package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;

public final class q implements OnConnectionFailedListener {
    public final StatusPendingResult a;

    public q(StatusPendingResult statusPendingResult0) {
        this.a = statusPendingResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        Status status0 = new Status(8);
        this.a.setResult(status0);
    }
}

