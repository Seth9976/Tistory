package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;

public final class zat implements ConnectionCallbacks, OnConnectionFailedListener {
    public final boolean a;
    public zau b;
    public final Api zaa;

    public zat(Api api0, boolean z) {
        this.zaa = api0;
        this.a = z;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        Preconditions.checkNotNull(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.b.onConnected(bundle0);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        Preconditions.checkNotNull(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.b.zaa(connectionResult0, this.zaa, this.a);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Preconditions.checkNotNull(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.b.onConnectionSuspended(v);
    }

    public final void zaa(zau zau0) {
        this.b = zau0;
    }
}

