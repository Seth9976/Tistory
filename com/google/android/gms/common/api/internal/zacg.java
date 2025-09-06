package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.IBinder;

public final class zacg implements Runnable {
    public final NonGmsServiceBrokerClient zaa;
    public final IBinder zab;

    public zacg(NonGmsServiceBrokerClient nonGmsServiceBrokerClient0, IBinder iBinder0) {
        this.zaa = nonGmsServiceBrokerClient0;
        this.zab = iBinder0;
    }

    @Override
    public final void run() {
        this.zaa.i = false;
        this.zaa.h = this.zab;
        Bundle bundle0 = new Bundle();
        this.zaa.e.onConnected(bundle0);
    }
}

