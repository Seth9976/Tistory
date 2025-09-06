package com.bumptech.glide;

import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.RequestTracker;

public final class l implements ConnectivityListener {
    public final RequestTracker a;
    public final RequestManager b;

    public l(RequestManager requestManager0, RequestTracker requestTracker0) {
        this.b = requestManager0;
        this.a = requestTracker0;
    }

    @Override  // com.bumptech.glide.manager.ConnectivityMonitor$ConnectivityListener
    public final void onConnectivityChanged(boolean z) {
        if(z) {
            synchronized(this.b) {
                this.a.restartRequests();
            }
        }
    }
}

