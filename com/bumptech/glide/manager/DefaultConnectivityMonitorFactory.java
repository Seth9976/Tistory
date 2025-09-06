package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class DefaultConnectivityMonitorFactory implements ConnectivityMonitorFactory {
    @Override  // com.bumptech.glide.manager.ConnectivityMonitorFactory
    @NonNull
    public ConnectivityMonitor build(@NonNull Context context0, @NonNull ConnectivityListener connectivityMonitor$ConnectivityListener0) {
        boolean z = ContextCompat.checkSelfPermission(context0, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if(Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", (z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"));
        }
        return z ? new b(context0, connectivityMonitor$ConnectivityListener0) : new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

