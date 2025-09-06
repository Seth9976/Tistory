package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag extends GoogleApiClient {
    public final String b;

    public zaag(String s) {
        this.b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long v, @NonNull TimeUnit timeUnit0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult clearDefaultAccountAndReconnect() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api api0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api api0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        throw new UnsupportedOperationException(this.b);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        throw new UnsupportedOperationException(this.b);
    }
}

