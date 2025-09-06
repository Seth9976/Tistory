package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zze implements ServiceConnection {
    public final int a;
    public final BaseGmsClient b;

    public zze(BaseGmsClient baseGmsClient0, int v) {
        this.b = baseGmsClient0;
        super();
        this.a = v;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        BaseGmsClient baseGmsClient0 = this.b;
        if(iBinder0 == null) {
            BaseGmsClient.a(baseGmsClient0);
            return;
        }
        synchronized(baseGmsClient0.n) {
            BaseGmsClient baseGmsClient1 = this.b;
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsServiceBroker iGmsServiceBroker0 = iInterface0 == null || !(iInterface0 instanceof IGmsServiceBroker) ? new i(iBinder0) : ((IGmsServiceBroker)iInterface0);
            baseGmsClient1.o = iGmsServiceBroker0;
        }
        this.b.zzl(0, null, this.a);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.b.n) {
            this.b.o = null;
        }
        Message message0 = this.b.l.obtainMessage(6, this.a, 1);
        this.b.l.sendMessage(message0);
    }
}

