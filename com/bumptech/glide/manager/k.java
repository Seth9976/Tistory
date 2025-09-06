package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;
import java.util.ArrayList;

public final class k implements ConnectivityListener {
    public final o a;

    public k(o o0) {
        this.a = o0;
    }

    @Override  // com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener
    public final void onConnectivityChanged(boolean z) {
        Util.assertMainThread();
        synchronized(this.a) {
            ArrayList arrayList0 = new ArrayList(this.a.b);
        }
        for(Object object0: arrayList0) {
            ((ConnectivityListener)object0).onConnectivityChanged(z);
        }
    }
}

