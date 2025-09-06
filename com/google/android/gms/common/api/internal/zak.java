package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class zak extends zap {
    public final SparseArray b;

    public zak(LifecycleFragment lifecycleFragment0) {
        super(lifecycleFragment0, GoogleApiAvailability.getInstance());
        this.b = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public final i0 a(int v) {
        return this.b.size() > v ? ((i0)this.b.get(this.b.keyAt(v))) : null;
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        for(int v = 0; v < this.b.size(); ++v) {
            i0 i00 = this.a(v);
            if(i00 != null) {
                printWriter0.append(s).append("GoogleApiClient #").print(i00.a);
                printWriter0.println(":");
                i00.b.dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        super.onStart();
        Log.d("AutoManageHelper", "onStart " + this.zaa + " " + this.b);
        if(this.zab.get() == null) {
            for(int v = 0; v < this.b.size(); ++v) {
                i0 i00 = this.a(v);
                if(i00 != null) {
                    i00.b.connect();
                }
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        super.onStop();
        for(int v = 0; v < this.b.size(); ++v) {
            i0 i00 = this.a(v);
            if(i00 != null) {
                i00.b.disconnect();
            }
        }
    }

    public static zak zaa(LifecycleActivity lifecycleActivity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(lifecycleActivity0);
        zak zak0 = (zak)lifecycleFragment0.getCallbackOrNull("AutoManageHelper", zak.class);
        return zak0 == null ? new zak(lifecycleFragment0) : zak0;
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult0, int v) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if(v < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        i0 i00 = (i0)this.b.get(v);
        if(i00 != null) {
            this.zae(v);
            OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0 = i00.c;
            if(googleApiClient$OnConnectionFailedListener0 != null) {
                googleApiClient$OnConnectionFailedListener0.onConnectionFailed(connectionResult0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        for(int v = 0; v < this.b.size(); ++v) {
            i0 i00 = this.a(v);
            if(i00 != null) {
                i00.b.connect();
            }
        }
    }

    public final void zad(int v, GoogleApiClient googleApiClient0, @Nullable OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        Preconditions.checkNotNull(googleApiClient0, "GoogleApiClient instance cannot be null");
        Preconditions.checkState(this.b.indexOfKey(v) < 0, "Already managing a GoogleApiClient with id " + v);
        j0 j00 = (j0)this.zab.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + v + " " + this.zaa + " " + j00);
        i0 i00 = new i0(this, v, googleApiClient0, googleApiClient$OnConnectionFailedListener0);
        googleApiClient0.registerConnectionFailedListener(i00);
        this.b.put(v, i00);
        if(this.zaa && j00 == null) {
            Log.d("AutoManageHelper", "connecting " + googleApiClient0.toString());
            googleApiClient0.connect();
        }
    }

    public final void zae(int v) {
        i0 i00 = (i0)this.b.get(v);
        this.b.remove(v);
        if(i00 != null) {
            i00.b.unregisterConnectionFailedListener(i00);
            i00.b.disconnect();
        }
    }
}

