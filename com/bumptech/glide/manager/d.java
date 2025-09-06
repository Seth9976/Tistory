package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

public final class d implements ComponentCallbacks2, FrameWaiter {
    @Override  // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override  // android.content.ComponentCallbacks2
    public final void onTrimMemory(int v) {
    }

    @Override  // com.bumptech.glide.manager.FrameWaiter
    public final void registerSelf(Activity activity0) {
    }
}

