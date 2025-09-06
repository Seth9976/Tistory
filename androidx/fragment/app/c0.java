package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;

public final class c0 implements SavedStateProvider {
    public final int a;
    public final Object b;

    public c0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Object object0 = this.b;
        if(this.a != 0) {
            return ((FragmentManager)object0).Q();
        }
        ((FragmentActivity)object0).markFragmentsCreated();
        ((FragmentActivity)object0).mFragmentLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
        return new Bundle();
    }
}

