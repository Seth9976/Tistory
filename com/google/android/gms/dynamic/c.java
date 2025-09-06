package com.google.android.gms.dynamic;

import android.os.Bundle;

public final class c implements zah {
    public final Bundle a;
    public final DeferredLifecycleHelper b;

    public c(DeferredLifecycleHelper deferredLifecycleHelper0, Bundle bundle0) {
        this.b = deferredLifecycleHelper0;
        this.a = bundle0;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 1;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate0) {
        this.b.a.onCreate(this.a);
    }
}

