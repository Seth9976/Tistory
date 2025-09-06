package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

public final class h implements ConnectionProgressReportCallbacks {
    public final WeakReference a;
    public final Api b;
    public final boolean c;

    public h(zaaw zaaw0, Api api0, boolean z) {
        this.a = new WeakReference(zaaw0);
        this.b = api0;
        this.c = z;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult0) {
        zaaw zaaw0 = (zaaw)this.a.get();
        if(zaaw0 == null) {
            return;
        }
        Preconditions.checkState(Looper.myLooper() == zaaw0.a.n.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        Lock lock0 = zaaw0.b;
        lock0.lock();
        try {
            if(zaaw0.g(0)) {
                if(!connectionResult0.isSuccess()) {
                    zaaw0.e(connectionResult0, this.b, this.c);
                }
                if(zaaw0.h()) {
                    zaaw0.f();
                }
                goto label_15;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        lock0.unlock();
        throw throwable0;
    label_15:
        lock0.unlock();
        return;
    label_17:
        lock0.unlock();
    }
}

