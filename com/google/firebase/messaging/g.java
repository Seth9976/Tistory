package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class g implements Application.ActivityLifecycleCallbacks {
    public final Set a;

    public g() {
        this.a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        Bundle bundle1;
        Intent intent0 = activity0.getIntent();
        if(intent0 != null && this.a.add(intent0)) {
            try {
                bundle1 = null;
                Bundle bundle2 = intent0.getExtras();
                if(bundle2 != null) {
                    bundle1 = bundle2.getBundle("gcm.n.analytics_data");
                }
            }
            catch(RuntimeException runtimeException0) {
                Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", runtimeException0);
            }
            if(MessagingAnalytics.shouldUploadScionMetrics(bundle1)) {
                MessagingAnalytics.logNotificationOpen(bundle1);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        if(activity0.isFinishing()) {
            Intent intent0 = activity0.getIntent();
            this.a.remove(intent0);
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
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

