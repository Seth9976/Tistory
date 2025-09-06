package com.bumptech.glide.manager;

import android.app.Activity;
import java.util.Collections;
import java.util.Set;

public final class c implements FrameWaiter, Lifecycle, RequestManagerTreeNode {
    public final int a;

    public c(int v) {
        this.a = v;
        super();
    }

    private final void a(Activity activity0) {
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public void addListener(LifecycleListener lifecycleListener0) {
        lifecycleListener0.onStart();
    }

    private final void b(Activity activity0) {
    }

    @Override  // com.bumptech.glide.manager.RequestManagerTreeNode
    public Set getDescendants() {
        return Collections.emptySet();
    }

    @Override  // com.bumptech.glide.manager.FrameWaiter
    public void registerSelf(Activity activity0) {
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public void removeListener(LifecycleListener lifecycleListener0) {
    }
}

