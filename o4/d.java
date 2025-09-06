package o4;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.List;

public final class d implements LifecycleEventObserver {
    public final boolean a;
    public final List b;
    public final NavBackStackEntry c;

    public d(NavBackStackEntry navBackStackEntry0, List list0, boolean z) {
        this.a = z;
        this.b = list0;
        this.c = navBackStackEntry0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        List list0 = this.b;
        NavBackStackEntry navBackStackEntry0 = this.c;
        if(this.a && !list0.contains(navBackStackEntry0)) {
            list0.add(navBackStackEntry0);
        }
        if(lifecycle$Event0 == Event.ON_START && !list0.contains(navBackStackEntry0)) {
            list0.add(navBackStackEntry0);
        }
        if(lifecycle$Event0 == Event.ON_STOP) {
            list0.remove(navBackStackEntry0);
        }
    }
}

