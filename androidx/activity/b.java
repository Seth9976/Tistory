package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

public final class b implements LifecycleEventObserver {
    public final int a;
    public final ComponentActivity b;

    public b(ComponentActivity componentActivity0, int v) {
        this.a = v;
        this.b = componentActivity0;
        super();
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        ComponentActivity componentActivity0 = this.b;
        if(this.a != 0) {
            ComponentActivity.b(componentActivity0, lifecycleOwner0, lifecycle$Event0);
            return;
        }
        Intrinsics.checkNotNullParameter(componentActivity0, "this$0");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_STOP) {
            Window window0 = componentActivity0.getWindow();
            if(window0 != null) {
                View view0 = window0.peekDecorView();
                if(view0 != null) {
                    view0.cancelPendingInputEvents();
                }
            }
        }
    }
}

