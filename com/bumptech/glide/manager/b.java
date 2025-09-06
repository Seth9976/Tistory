package com.bumptech.glide.manager;

import android.content.Context;

public final class b implements ConnectivityMonitor {
    public final Context a;
    public final ConnectivityListener b;

    public b(Context context0, ConnectivityListener connectivityMonitor$ConnectivityListener0) {
        this.a = context0.getApplicationContext();
        this.b = connectivityMonitor$ConnectivityListener0;
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        o o0 = o.a(this.a);
        synchronized(o0) {
            o0.b.add(this.b);
            if(!o0.c && !o0.b.isEmpty()) {
                o0.c = o0.a.register();
            }
        }
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        o o0 = o.a(this.a);
        synchronized(o0) {
            o0.b.remove(this.b);
            if(o0.c && o0.b.isEmpty()) {
                o0.a.unregister();
                o0.c = false;
            }
        }
    }
}

