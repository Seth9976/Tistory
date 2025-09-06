package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;

public final class i0 implements OnConnectionFailedListener {
    public final int a;
    public final GoogleApiClient b;
    public final OnConnectionFailedListener c;
    public final zak d;

    public i0(zak zak0, int v, GoogleApiClient googleApiClient0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.d = zak0;
        this.a = v;
        this.b = googleApiClient0;
        this.c = googleApiClient$OnConnectionFailedListener0;
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        Log.d("AutoManageHelper", "beginFailureResolution for " + connectionResult0);
        this.d.zah(connectionResult0, this.a);
    }
}

