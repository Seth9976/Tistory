package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;

public final class zaae extends zap {
    public final ArraySet b;
    public final GoogleApiManager c;

    public zaae(LifecycleFragment lifecycleFragment0, GoogleApiManager googleApiManager0, GoogleApiAvailability googleApiAvailability0) {
        super(lifecycleFragment0, googleApiAvailability0);
        this.b = new ArraySet();
        this.c = googleApiManager0;
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", this);
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        if(!this.b.isEmpty()) {
            this.c.zaC(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStart() {
        super.onStart();
        if(!this.b.isEmpty()) {
            this.c.zaC(this);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void onStop() {
        super.onStop();
        GoogleApiManager googleApiManager0 = this.c;
        googleApiManager0.getClass();
        synchronized(GoogleApiManager.q) {
            if(googleApiManager0.k == this) {
                googleApiManager0.k = null;
                googleApiManager0.l.clear();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zab(ConnectionResult connectionResult0, int v) {
        this.c.zaz(connectionResult0, v);
    }

    @Override  // com.google.android.gms.common.api.internal.zap
    public final void zac() {
        this.c.zaA();
    }

    @MainThread
    public static void zad(Activity activity0, GoogleApiManager googleApiManager0, ApiKey apiKey0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        zaae zaae0 = (zaae)lifecycleFragment0.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if(zaae0 == null) {
            zaae0 = new zaae(lifecycleFragment0, googleApiManager0, GoogleApiAvailability.getInstance());
        }
        Preconditions.checkNotNull(apiKey0, "ApiKey cannot be null");
        zaae0.b.add(apiKey0);
        googleApiManager0.zaC(zaae0);
    }
}

