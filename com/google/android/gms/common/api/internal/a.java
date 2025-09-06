package com.google.android.gms.common.api.internal;

import java.util.ArrayList;

public final class a extends LifecycleCallback {
    public ArrayList a;

    @Override  // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        synchronized(this) {
            ArrayList arrayList0 = this.a;
            this.a = new ArrayList();
        }
        for(Object object0: arrayList0) {
            ((Runnable)object0).run();
        }
    }
}

