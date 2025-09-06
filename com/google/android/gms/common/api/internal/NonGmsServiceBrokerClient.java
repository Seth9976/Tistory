package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class NonGmsServiceBrokerClient implements ServiceConnection, Client {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final Context d;
    public final ConnectionCallbacks e;
    public final zaq f;
    public final OnConnectionFailedListener g;
    public IBinder h;
    public boolean i;
    public String j;

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull ComponentName componentName0, @NonNull ConnectionCallbacks connectionCallbacks0, @NonNull OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, null, null, componentName0, connectionCallbacks0, onConnectionFailedListener0);
    }

    public NonGmsServiceBrokerClient(Context context0, Looper looper0, String s, String s1, ComponentName componentName0, ConnectionCallbacks connectionCallbacks0, OnConnectionFailedListener onConnectionFailedListener0) {
        this.i = false;
        this.j = null;
        this.d = context0;
        this.f = new zaq(looper0);
        this.e = connectionCallbacks0;
        this.g = onConnectionFailedListener0;
        if(s == null || s1 == null) {
            if(componentName0 != null) {
                this.a = s;
                this.b = s1;
                this.c = componentName0;
                return;
            }
        }
        else if(componentName0 == null) {
            componentName0 = null;
            this.a = s;
            this.b = s1;
            this.c = componentName0;
            return;
        }
        throw new AssertionError("Must specify either package or component, but not both");
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@NonNull Context context0, @NonNull Looper looper0, @NonNull String s, @NonNull String s1, @NonNull ConnectionCallbacks connectionCallbacks0, @NonNull OnConnectionFailedListener onConnectionFailedListener0) {
        this(context0, looper0, s, s1, null, connectionCallbacks0, onConnectionFailedListener0);
    }

    public final void a() {
        if(Thread.currentThread() != this.f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient\'s handler thread.");
        }
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void connect(@NonNull ConnectionProgressReportCallbacks baseGmsClient$ConnectionProgressReportCallbacks0) {
        this.a();
        if(this.isConnected()) {
            try {
                this.disconnect("connect() called when already connected");
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            Intent intent0 = new Intent();
            ComponentName componentName0 = this.c;
            if(componentName0 == null) {
                intent0.setPackage(this.a).setAction(this.b);
            }
            else {
                intent0.setComponent(componentName0);
            }
            boolean z = this.d.bindService(intent0, this, 0x1081);
            this.i = z;
        }
        catch(SecurityException securityException0) {
            this.i = false;
            this.h = null;
            throw securityException0;
        }
        if(!z) {
            this.h = null;
            ConnectionResult connectionResult0 = new ConnectionResult(16);
            this.g.onConnectionFailed(connectionResult0);
        }
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void disconnect() {
        this.a();
        try {
            this.d.unbindService(this);
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.i = false;
        this.h = null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final void disconnect(@NonNull String s) {
        this.a();
        this.j = s;
        this.disconnect();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Nullable
    @WorkerThread
    @KeepForSdk
    public IBinder getBinder() {
        this.a();
        return this.h;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final String getEndpointPackageName() {
        String s = this.a;
        if(s != null) {
            return s;
        }
        Preconditions.checkNotNull(this.c);
        return this.c.getPackageName();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @Nullable
    public final String getLastDisconnectMessage() {
        return this.j;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 0;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void getRemoteService(@Nullable IAccountAccessor iAccountAccessor0, @Nullable Set set0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Set getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @Nullable
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @NonNull
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final boolean isConnected() {
        this.a();
        return this.h != null;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    @WorkerThread
    public final boolean isConnecting() {
        this.a();
        return this.i;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName0, @NonNull IBinder iBinder0) {
        zacg zacg0 = new zacg(this, iBinder0);
        this.f.post(zacg0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName0) {
        zacf zacf0 = new zacf(this);
        this.f.post(zacf0);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final void onUserSignOut(@NonNull SignOutCallbacks baseGmsClient$SignOutCallbacks0) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean providesSignIn() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresAccount() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public final boolean requiresSignIn() {
        return false;
    }

    public final void zac(@Nullable String s) {
    }
}

