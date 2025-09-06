package androidx.lifecycle;

import java.util.List;

public final class h0 implements LifecycleEventObserver {
    public final Object a;
    public final c b;

    public h0(Object object0) {
        this.a = object0;
        e e0 = e.c;
        Class class0 = object0.getClass();
        c c0 = (c)e0.a.get(class0);
        if(c0 == null) {
            c0 = e0.a(class0, null);
        }
        this.b = c0;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        c.a(((List)this.b.a.get(lifecycle$Event0)), lifecycleOwner0, lifecycle$Event0, this.a);
        c.a(((List)this.b.a.get(Event.ON_ANY)), lifecycleOwner0, lifecycle$Event0, this.a);
    }
}

