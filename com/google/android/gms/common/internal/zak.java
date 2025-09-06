package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zak implements Handler.Callback {
    public final zaj a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public volatile boolean e;
    public final AtomicInteger f;
    public boolean g;
    public final zaq h;
    public final Object i;

    public zak(Looper looper0, zaj zaj0) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = false;
        this.f = new AtomicInteger(0);
        this.g = false;
        this.i = new Object();
        this.a = zaj0;
        this.h = new zaq(looper0, this);
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v = message0.what;
        if(v == 1) {
            ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)message0.obj;
            synchronized(this.i) {
                if(this.e && this.a.isConnected() && this.b.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(null);
                }
                return true;
            }
        }
        Log.wtf("GmsClientEvents", "Don\'t know how to handle message: " + v, new Exception());
        return false;
    }

    public final void zaa() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void zab() {
        this.e = true;
    }

    @VisibleForTesting
    public final void zac(ConnectionResult connectionResult0) {
        Preconditions.checkHandlerThread(this.h, "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized(this.i) {
            ArrayList arrayList0 = new ArrayList(this.d);
            int v1 = this.f.get();
            for(Object object1: arrayList0) {
                OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = (OnConnectionFailedListener)object1;
                if(this.e && this.f.get() == v1) {
                    if(!this.d.contains(googleApiClient$OnConnectionFailedListener0)) {
                        continue;
                    }
                    googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
                    continue;
                }
                return;
            }
        }
    }

    @VisibleForTesting
    public final void zad(@Nullable Bundle bundle0) {
        Preconditions.checkHandlerThread(this.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized(this.i) {
            Preconditions.checkState(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            Preconditions.checkState(this.c.isEmpty());
            ArrayList arrayList0 = new ArrayList(this.b);
            int v1 = this.f.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.e || !this.a.isConnected() || this.f.get() != v1) {
                    break;
                }
                if(!this.c.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnected(bundle0);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    @VisibleForTesting
    public final void zae(int v) {
        Preconditions.checkHandlerThread(this.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized(this.i) {
            this.g = true;
            ArrayList arrayList0 = new ArrayList(this.b);
            int v2 = this.f.get();
            for(Object object1: arrayList0) {
                ConnectionCallbacks googleApiClient$ConnectionCallbacks0 = (ConnectionCallbacks)object1;
                if(!this.e || this.f.get() != v2) {
                    break;
                }
                if(this.b.contains(googleApiClient$ConnectionCallbacks0)) {
                    googleApiClient$ConnectionCallbacks0.onConnectionSuspended(v);
                }
            }
            this.c.clear();
            this.g = false;
        }
    }

    public final void zaf(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.i) {
            if(this.b.contains(googleApiClient$ConnectionCallbacks0)) {
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks0 + " is already registered");
            }
            else {
                this.b.add(googleApiClient$ConnectionCallbacks0);
            }
        }
        if(this.a.isConnected()) {
            Message message0 = this.h.obtainMessage(1, googleApiClient$ConnectionCallbacks0);
            this.h.sendMessage(message0);
        }
    }

    public final void zag(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.i) {
            if(this.d.contains(googleApiClient$OnConnectionFailedListener0)) {
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener0 + " is already registered");
            }
            else {
                this.d.add(googleApiClient$OnConnectionFailedListener0);
            }
        }
    }

    public final void zah(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.i) {
            if(!this.b.remove(googleApiClient$ConnectionCallbacks0)) {
                Log.w("GmsClientEvents", "unregisterConnectionCallbacks(): listener " + googleApiClient$ConnectionCallbacks0 + " not found");
            }
            else if(this.g) {
                this.c.add(googleApiClient$ConnectionCallbacks0);
            }
        }
    }

    public final void zai(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.i) {
            if(!this.d.remove(googleApiClient$OnConnectionFailedListener0)) {
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + googleApiClient$OnConnectionFailedListener0 + " not found");
            }
        }
    }

    public final boolean zaj(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        Preconditions.checkNotNull(googleApiClient$ConnectionCallbacks0);
        synchronized(this.i) {
        }
        return this.b.contains(googleApiClient$ConnectionCallbacks0);
    }

    public final boolean zak(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient$OnConnectionFailedListener0);
        synchronized(this.i) {
        }
        return this.d.contains(googleApiClient$OnConnectionFailedListener0);
    }
}

