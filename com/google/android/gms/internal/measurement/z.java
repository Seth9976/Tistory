package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class z implements Application.ActivityLifecycleCallbacks {
    public final zzef a;

    public z(zzef zzef0) {
        this.a = zzef0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        p p0 = new p(this, bundle0, activity0);
        this.a.b(p0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        y y0 = new y(this, activity0, 4);
        this.a.b(y0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        y y0 = new y(this, activity0, 2);
        this.a.b(y0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        y y0 = new y(this, activity0, 1);
        this.a.b(y0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        zzbz zzbz0 = new zzbz();
        p p0 = new p(this, activity0, zzbz0);
        this.a.b(p0);
        Bundle bundle1 = zzbz0.zzb(50L);
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        y y0 = new y(this, activity0, 0);
        this.a.b(y0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
        y y0 = new y(this, activity0, 3);
        this.a.b(y0);
    }
}

