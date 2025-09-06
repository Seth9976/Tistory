package androidx.databinding;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.ref.WeakReference;

public final class n implements LifecycleObserver {
    public final WeakReference a;

    public n(ViewDataBinding viewDataBinding0) {
        this.a = new WeakReference(viewDataBinding0);
    }

    @OnLifecycleEvent(Event.ON_START)
    public void onStart() {
        ViewDataBinding viewDataBinding0 = (ViewDataBinding)this.a.get();
        if(viewDataBinding0 != null) {
            viewDataBinding0.executePendingBindings();
        }
    }
}

