package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public final class zada extends TransformedResult implements ResultCallback {
    public ResultTransform a;
    public zada b;
    public volatile ResultCallbacks c;
    public PendingResult d;
    public final Object e;
    public Status f;
    public final WeakReference g;
    public final s h;
    public boolean i;

    public zada(WeakReference weakReference0) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = new Object();
        this.f = null;
        this.i = false;
        Preconditions.checkNotNull(weakReference0, "GoogleApiClient reference must not be null");
        this.g = weakReference0;
        GoogleApiClient googleApiClient0 = (GoogleApiClient)weakReference0.get();
        this.h = new s(this, (googleApiClient0 == null ? Looper.getMainLooper() : googleApiClient0.getLooper()), 2);
    }

    public final void a(Status status0) {
        synchronized(this.e) {
            this.f = status0;
            this.c(status0);
        }
    }

    @Override  // com.google.android.gms.common.api.TransformedResult
    public final void andFinally(@NonNull ResultCallbacks resultCallbacks0) {
        boolean z = false;
        synchronized(this.e) {
            Preconditions.checkState(this.c == null, "Cannot call andFinally() twice.");
            if(this.a == null) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.c = resultCallbacks0;
            this.b();
        }
    }

    public final void b() {
        if(this.a == null && this.c == null) {
            return;
        }
        GoogleApiClient googleApiClient0 = (GoogleApiClient)this.g.get();
        if(!this.i && this.a != null && googleApiClient0 != null) {
            googleApiClient0.zao(this);
            this.i = true;
        }
        Status status0 = this.f;
        if(status0 != null) {
            this.c(status0);
            return;
        }
        PendingResult pendingResult0 = this.d;
        if(pendingResult0 != null) {
            pendingResult0.setResultCallback(this);
        }
    }

    public final void c(Status status0) {
        synchronized(this.e) {
            if(this.a == null) {
                GoogleApiClient googleApiClient0 = (GoogleApiClient)this.g.get();
                if(this.c != null && googleApiClient0 != null) {
                    ((ResultCallbacks)Preconditions.checkNotNull(this.c)).onFailure(status0);
                }
            }
            else {
                Status status1 = (Status)Preconditions.checkNotNull(status0, "onFailure must not return null");
                ((zada)Preconditions.checkNotNull(this.b)).a(status1);
            }
        }
    }

    public static final void d(Result result0) {
        if(result0 instanceof Releasable) {
            try {
                ((Releasable)result0).release();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("TransformedResultImpl", "Unable to release " + result0, runtimeException0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.ResultCallback
    public final void onResult(Result result0) {
        synchronized(this.e) {
            if(!result0.getStatus().isSuccess()) {
                this.a(result0.getStatus());
                zada.d(result0);
            }
            else if(this.a != null) {
                zaco.zaa().submit(new l0(2, this, result0));
            }
            else {
                GoogleApiClient googleApiClient0 = (GoogleApiClient)this.g.get();
                if(this.c != null && googleApiClient0 != null) {
                    ((ResultCallbacks)Preconditions.checkNotNull(this.c)).onSuccess(result0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.common.api.TransformedResult
    @NonNull
    public final TransformedResult then(@NonNull ResultTransform resultTransform0) {
        boolean z = false;
        synchronized(this.e) {
            Preconditions.checkState(this.a == null, "Cannot call then() twice.");
            if(this.c == null) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.a = resultTransform0;
            zada zada0 = new zada(this.g);
            this.b = zada0;
            this.b();
            return zada0;
        }
    }

    public final void zai(PendingResult pendingResult0) {
        synchronized(this.e) {
            this.d = pendingResult0;
            this.b();
        }
    }
}

