package com.google.android.material.color;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.UiModeManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashSet;

public final class b implements Application.ActivityLifecycleCallbacks {
    public final LinkedHashSet a;
    public final ColorContrastOptions b;
    public a c;

    public b(ColorContrastOptions colorContrastOptions0) {
        this.a = new LinkedHashSet();
        this.b = colorContrastOptions0;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        this.a.remove(activity0);
        UiModeManager uiModeManager0 = (UiModeManager)activity0.getSystemService("uimode");
        if(uiModeManager0 != null && this.c != null && this.a.isEmpty()) {
            uiModeManager0.removeContrastChangeListener(this.c);
            this.c = null;
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity0, Bundle bundle0) {
        UiModeManager uiModeManager0 = (UiModeManager)activity0.getSystemService("uimode");
        LinkedHashSet linkedHashSet0 = this.a;
        if(uiModeManager0 != null && linkedHashSet0.isEmpty() && this.c == null) {
            this.c = new a(this);
            uiModeManager0.addContrastChangeListener(ContextCompat.getMainExecutor(activity0.getApplicationContext()), this.c);
        }
        linkedHashSet0.add(activity0);
        if(uiModeManager0 != null) {
            ColorContrast.applyToActivityIfAvailable(activity0, this.b);
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

