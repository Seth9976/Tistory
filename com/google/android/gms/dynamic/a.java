package com.google.android.gms.dynamic;

public final class a implements OnDelegateCreatedListener {
    public final DeferredLifecycleHelper a;

    public a(DeferredLifecycleHelper deferredLifecycleHelper0) {
        this.a = deferredLifecycleHelper0;
    }

    @Override  // com.google.android.gms.dynamic.OnDelegateCreatedListener
    public final void onDelegateCreated(LifecycleDelegate lifecycleDelegate0) {
        DeferredLifecycleHelper deferredLifecycleHelper0 = this.a;
        deferredLifecycleHelper0.a = lifecycleDelegate0;
        for(Object object0: deferredLifecycleHelper0.c) {
            ((zah)object0).zab(deferredLifecycleHelper0.a);
        }
        deferredLifecycleHelper0.c.clear();
        deferredLifecycleHelper0.b = null;
    }
}

