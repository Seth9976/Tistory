package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;

public final class f implements LifecycleListener {
    public final Lifecycle a;
    public final g b;

    public f(g g0, Lifecycle lifecycle0) {
        this.b = g0;
        this.a = lifecycle0;
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
        this.b.a.remove(this.a);
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
    }
}

