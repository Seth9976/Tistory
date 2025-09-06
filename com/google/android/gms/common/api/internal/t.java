package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

public final class t extends zabw {
    public final WeakReference a;

    public t(zabe zabe0) {
        this.a = new WeakReference(zabe0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabe0 = (zabe)this.a.get();
        if(zabe0 == null) {
            return;
        }
        zabe.b(zabe0);
    }
}

