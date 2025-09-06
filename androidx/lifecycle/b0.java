package androidx.lifecycle;

public final class b0 extends c0 implements LifecycleEventObserver {
    public final LifecycleOwner e;
    public final LiveData f;

    public b0(LiveData liveData0, LifecycleOwner lifecycleOwner0, Observer observer0) {
        this.f = liveData0;
        super(liveData0, observer0);
        this.e = lifecycleOwner0;
    }

    @Override  // androidx.lifecycle.c0
    public final void b() {
        this.e.getLifecycle().removeObserver(this);
    }

    @Override  // androidx.lifecycle.c0
    public final boolean c(LifecycleOwner lifecycleOwner0) {
        return this.e == lifecycleOwner0;
    }

    @Override  // androidx.lifecycle.c0
    public final boolean d() {
        return this.e.getLifecycle().getCurrentState().isAtLeast(State.STARTED);
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        LifecycleOwner lifecycleOwner1 = this.e;
        State lifecycle$State0 = lifecycleOwner1.getLifecycle().getCurrentState();
        if(lifecycle$State0 == State.DESTROYED) {
            this.f.removeObserver(this.a);
            return;
        }
        State lifecycle$State1 = null;
        while(lifecycle$State1 != lifecycle$State0) {
            this.a(this.d());
            lifecycle$State1 = lifecycle$State0;
            lifecycle$State0 = lifecycleOwner1.getLifecycle().getCurrentState();
        }
    }
}

