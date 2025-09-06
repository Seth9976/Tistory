package f5;

import android.os.Handler;
import androidx.appcompat.widget.a;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class c implements LifecycleEventObserver {
    public final Handler a;
    public final a b;

    public c(Handler handler0, a a0) {
        this.a = handler0;
        this.b = a0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            lifecycleOwner0.getLifecycle().removeObserver(this);
        }
    }
}

