package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.signin.zad;
import com.google.android.gms.signin.zae;
import java.util.Set;

public final class zact extends zac implements ConnectionCallbacks, OnConnectionFailedListener {
    public final Context a;
    public final Handler b;
    public final AbstractClientBuilder c;
    public final Set d;
    public final ClientSettings e;
    public zae f;
    public zacs g;
    public static final AbstractClientBuilder h;

    static {
        zact.h = zad.zac;
    }

    @WorkerThread
    public zact(Context context0, Handler handler0, @NonNull ClientSettings clientSettings0) {
        this.a = context0;
        this.b = handler0;
        this.e = (ClientSettings)Preconditions.checkNotNull(clientSettings0, "ClientSettings must not be null");
        this.d = clientSettings0.getRequiredScopes();
        this.c = zact.h;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnected(@Nullable Bundle bundle0) {
        this.f.zad(this);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        this.g.zae(connectionResult0);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    @WorkerThread
    public final void onConnectionSuspended(int v) {
        this.f.disconnect();
    }

    @Override  // com.google.android.gms.signin.internal.zac
    @BinderThread
    public final void zab(zak zak0) {
        l0 l00 = new l0(1, this, zak0);
        this.b.post(l00);
    }

    @WorkerThread
    public final void zae(zacs zacs0) {
        zae zae0 = this.f;
        if(zae0 != null) {
            zae0.disconnect();
        }
        this.e.zae(System.identityHashCode(this));
        Handler handler0 = this.b;
        Looper looper0 = handler0.getLooper();
        this.f = this.c.buildClient(this.a, looper0, this.e, this.e.zaa(), this, this);
        this.g = zacs0;
        if(this.d != null && !this.d.isEmpty()) {
            this.f.zab();
            return;
        }
        handler0.post(new a(this, 10));
    }

    public final void zaf() {
        zae zae0 = this.f;
        if(zae0 != null) {
            zae0.disconnect();
        }
    }
}

