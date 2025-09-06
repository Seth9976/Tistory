package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class w implements LifecycleEventObserver {
    public final Fragment a;

    public w(Fragment fragment0) {
        this.a = fragment0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_STOP) {
            View view0 = this.a.mView;
            if(view0 != null) {
                view0.cancelPendingInputEvents();
            }
        }
    }
}

