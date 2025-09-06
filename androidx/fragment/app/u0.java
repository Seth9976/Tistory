package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

public final class u0 implements LifecycleEventObserver {
    public final String a;
    public final FragmentResultListener b;
    public final Lifecycle c;
    public final FragmentManager d;

    public u0(FragmentManager fragmentManager0, String s, FragmentResultListener fragmentResultListener0, Lifecycle lifecycle0) {
        this.d = fragmentManager0;
        this.a = s;
        this.b = fragmentResultListener0;
        this.c = lifecycle0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        FragmentManager fragmentManager0 = this.d;
        String s = this.a;
        if(lifecycle$Event0 == Event.ON_START) {
            Bundle bundle0 = (Bundle)fragmentManager0.k.get(s);
            if(bundle0 != null) {
                this.b.onFragmentResult(s, bundle0);
                fragmentManager0.clearFragmentResult(s);
            }
        }
        if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.c.removeObserver(this);
            fragmentManager0.l.remove(s);
        }
    }
}

