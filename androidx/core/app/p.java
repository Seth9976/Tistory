package androidx.core.app;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;

public final class p implements Application.ActivityLifecycleCallbacks {
    public Object a;
    public Activity b;
    public final int c;
    public boolean d;
    public boolean e;
    public boolean f;

    public p(Activity activity0) {
        this.d = false;
        this.e = false;
        this.f = false;
        this.b = activity0;
        this.c = activity0.hashCode();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        if(this.b == activity0) {
            this.b = null;
            this.e = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        if(this.e && !this.f && !this.d) {
            try {
                Object object0 = this.a;
                Object object1 = q.c.get(activity0);
                if(object1 == object0 && activity0.hashCode() == this.c) {
                    o o0 = new o(q.b.get(activity0), object1, false, 2);
                    q.g.postAtFrontOfQueue(o0);
                    this.f = true;
                    this.a = null;
                }
            }
            catch(Throwable throwable0) {
                Log.e("ActivityRecreator", "Exception while fetching field values", throwable0);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
        if(this.b == activity0) {
            this.d = true;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

