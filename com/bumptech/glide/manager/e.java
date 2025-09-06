package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bumptech.glide.util.Util;
import java.util.HashSet;

public final class e implements LifecycleObserver, Lifecycle {
    public final HashSet a;
    public final androidx.lifecycle.Lifecycle b;

    public e(androidx.lifecycle.Lifecycle lifecycle0) {
        this.a = new HashSet();
        this.b = lifecycle0;
        lifecycle0.addObserver(this);
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public final void addListener(LifecycleListener lifecycleListener0) {
        this.a.add(lifecycleListener0);
        androidx.lifecycle.Lifecycle lifecycle0 = this.b;
        if(lifecycle0.getCurrentState() == State.DESTROYED) {
            lifecycleListener0.onDestroy();
            return;
        }
        if(lifecycle0.getCurrentState().isAtLeast(State.STARTED)) {
            lifecycleListener0.onStart();
            return;
        }
        lifecycleListener0.onStop();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((LifecycleListener)object0).onDestroy();
        }
        lifecycleOwner0.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((LifecycleListener)object0).onStart();
        }
    }

    @OnLifecycleEvent(Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner0) {
        for(Object object0: Util.getSnapshot(this.a)) {
            ((LifecycleListener)object0).onStop();
        }
    }

    @Override  // com.bumptech.glide.manager.Lifecycle
    public final void removeListener(LifecycleListener lifecycleListener0) {
        this.a.remove(lifecycleListener0);
    }
}

