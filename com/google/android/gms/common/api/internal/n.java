package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import java.util.concurrent.locks.Lock;

public final class n implements ConnectionCallbacks, OnConnectionFailedListener {
    public final zaaw a;

    public n(zaaw zaaw0) {
        this.a = zaaw0;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        ClientSettings clientSettings0 = (ClientSettings)Preconditions.checkNotNull(this.a.r);
        ((zae)Preconditions.checkNotNull(this.a.k)).zad(new m(this.a));
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        zaaw zaaw0 = this.a;
        Lock lock0 = zaaw0.b;
        zaaw0.b.lock();
        try {
            if(!zaaw0.l || connectionResult0.hasResolution()) {
                zaaw0.d(connectionResult0);
            }
            else {
                zaaw0.a();
                zaaw0.f();
            }
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }
}

