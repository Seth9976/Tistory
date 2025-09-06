package dagger.hilt.android.internal.managers;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class e implements LifecycleEventObserver {
    public final FragmentContextWrapper a;

    public e(FragmentContextWrapper viewComponentManager$FragmentContextWrapper0) {
        this.a = viewComponentManager$FragmentContextWrapper0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.a.a = null;
            this.a.b = null;
            this.a.c = null;
        }
    }
}

