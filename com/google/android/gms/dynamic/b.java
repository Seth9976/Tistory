package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

public final class b implements zah {
    public final Activity a;
    public final Bundle b;
    public final Bundle c;
    public final DeferredLifecycleHelper d;

    public b(DeferredLifecycleHelper deferredLifecycleHelper0, Activity activity0, Bundle bundle0, Bundle bundle1) {
        this.d = deferredLifecycleHelper0;
        this.a = activity0;
        this.b = bundle0;
        this.c = bundle1;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override  // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate0) {
        this.d.a.onInflate(this.a, this.b, this.c);
    }
}

