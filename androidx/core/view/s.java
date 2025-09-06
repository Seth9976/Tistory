package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

public final class s {
    public final Lifecycle a;
    public LifecycleEventObserver b;

    public s(Lifecycle lifecycle0, LifecycleEventObserver lifecycleEventObserver0) {
        this.a = lifecycle0;
        this.b = lifecycleEventObserver0;
        lifecycle0.addObserver(lifecycleEventObserver0);
    }
}

