package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class j extends LifecycleCallback {
    public final ArrayList a;

    public j(LifecycleFragment lifecycleFragment0) {
        super(lifecycleFragment0);
        this.a = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    public static j a(Activity activity0) {
        LifecycleFragment lifecycleFragment0 = LifecycleCallback.getFragment(activity0);
        j j0 = (j)lifecycleFragment0.getCallbackOrNull("TaskOnStopCallback", j.class);
        return j0 == null ? new j(lifecycleFragment0) : j0;
    }

    public final void b(zzq zzq0) {
        synchronized(this.a) {
            WeakReference weakReference0 = new WeakReference(zzq0);
            this.a.add(weakReference0);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized(this.a) {
            for(Object object0: this.a) {
                zzq zzq0 = (zzq)((WeakReference)object0).get();
                if(zzq0 != null) {
                    zzq0.zzc();
                }
            }
            this.a.clear();
        }
    }
}

