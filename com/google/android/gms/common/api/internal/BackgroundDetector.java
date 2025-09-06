package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean arg1);
    }

    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final ArrayList c;
    public boolean d;
    public static final BackgroundDetector e;

    static {
        BackgroundDetector.e = new BackgroundDetector();
    }

    public BackgroundDetector() {
        this.a = new AtomicBoolean();
        this.b = new AtomicBoolean();
        this.c = new ArrayList();
        this.d = false;
    }

    public final void a(boolean z) {
        synchronized(BackgroundDetector.e) {
            for(Object object0: this.c) {
                ((BackgroundStateChangeListener)object0).onBackgroundStateChanged(z);
            }
        }
    }

    @KeepForSdk
    public void addListener(@NonNull BackgroundStateChangeListener backgroundDetector$BackgroundStateChangeListener0) {
        synchronized(BackgroundDetector.e) {
            this.c.add(backgroundDetector$BackgroundStateChangeListener0);
        }
    }

    @NonNull
    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return BackgroundDetector.e;
    }

    @KeepForSdk
    public static void initialize(@NonNull Application application0) {
        BackgroundDetector backgroundDetector0 = BackgroundDetector.e;
        synchronized(backgroundDetector0) {
            if(!backgroundDetector0.d) {
                application0.registerActivityLifecycleCallbacks(backgroundDetector0);
                application0.registerComponentCallbacks(backgroundDetector0);
                backgroundDetector0.d = true;
            }
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.a.get();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity0, @Nullable Bundle bundle0) {
        boolean z = this.a.compareAndSet(true, false);
        this.b.set(true);
        if(z) {
            this.a(false);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity0) {
        boolean z = this.a.compareAndSet(true, false);
        this.b.set(true);
        if(z) {
            this.a(false);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity0, @NonNull Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
        if(v == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            this.a(true);
        }
    }

    @TargetApi(16)
    @KeepForSdk
    public boolean readCurrentStateIfPossible(boolean z) {
        AtomicBoolean atomicBoolean0 = this.b;
        if(!atomicBoolean0.get()) {
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(!atomicBoolean0.getAndSet(true) && activityManager$RunningAppProcessInfo0.importance > 100) {
                this.a.set(true);
            }
        }
        return this.isInBackground();
    }
}

