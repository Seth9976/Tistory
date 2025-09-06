package com.google.android.gms.dynamic;

public final class f implements zah {
    public final int a;
    public final DeferredLifecycleHelper b;

    public f(DeferredLifecycleHelper deferredLifecycleHelper0, int v) {
        this.a = v;
        this.b = deferredLifecycleHelper0;
        super();
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return this.a == 0 ? 4 : 5;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate0) {
        if(this.a != 0) {
            this.b.a.onResume();
            return;
        }
        this.b.a.onStart();
    }
}

