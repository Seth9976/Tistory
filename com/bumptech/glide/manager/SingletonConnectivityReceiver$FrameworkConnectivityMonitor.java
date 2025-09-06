package com.bumptech.glide.manager;

interface SingletonConnectivityReceiver.FrameworkConnectivityMonitor {
    boolean register();

    void unregister();
}

