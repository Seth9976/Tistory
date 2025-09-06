package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

public final class zab extends ActivityLifecycleObserver {
    public final WeakReference a;

    public zab(a a0) {
        this.a = new WeakReference(a0);
    }

    @Override  // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable0) {
        a a0 = (a)this.a.get();
        if(a0 != null) {
            synchronized(a0) {
                a0.a.add(runnable0);
                return this;
            }
        }
        throw new IllegalStateException("The target activity has already been GC\'d");
    }
}

