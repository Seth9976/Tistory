package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;

public final class l implements Runnable {
    public final boolean a;
    public final m b;

    public l(m m0, boolean z) {
        this.b = m0;
        this.a = z;
    }

    @Override
    public final void run() {
        this.b.getClass();
        Util.assertMainThread();
        n n0 = this.b.a;
        boolean z = n0.a;
        boolean z1 = this.a;
        n0.a = z1;
        if(z != z1) {
            n0.b.onConnectivityChanged(z1);
        }
    }
}

