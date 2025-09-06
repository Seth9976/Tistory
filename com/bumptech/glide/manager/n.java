package com.bumptech.glide.manager;

import android.net.ConnectivityManager;
import android.util.Log;
import com.bumptech.glide.util.GlideSuppliers.GlideSupplier;

public final class n implements SingletonConnectivityReceiver.FrameworkConnectivityMonitor {
    public boolean a;
    public final k b;
    public final GlideSupplier c;
    public final m d;

    public n(GlideSupplier glideSuppliers$GlideSupplier0, k k0) {
        this.d = new m(this);
        this.c = glideSuppliers$GlideSupplier0;
        this.b = k0;
    }

    @Override  // com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor
    public final boolean register() {
        boolean z = ((ConnectivityManager)this.c.get()).getActiveNetwork() != null;
        try {
            this.a = z;
            ((ConnectivityManager)this.c.get()).registerDefaultNetworkCallback(this.d);
            return true;
        }
        catch(RuntimeException runtimeException0) {
            if(Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", runtimeException0);
            }
            return false;
        }
    }

    @Override  // com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitor
    public final void unregister() {
        ((ConnectivityManager)this.c.get()).unregisterNetworkCallback(this.d);
    }
}

