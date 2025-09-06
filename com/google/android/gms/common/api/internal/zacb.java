package com.google.android.gms.common.api.internal;

public final class zacb implements Runnable {
    public final ListenerHolder zaa;
    public final Notifier zab;

    public zacb(ListenerHolder listenerHolder0, Notifier listenerHolder$Notifier0) {
        this.zaa = listenerHolder0;
        this.zab = listenerHolder$Notifier0;
    }

    @Override
    public final void run() {
        Notifier listenerHolder$Notifier0 = this.zab;
        Object object0 = this.zaa.b;
        if(object0 == null) {
            listenerHolder$Notifier0.onNotifyListenerFailed();
            return;
        }
        try {
            listenerHolder$Notifier0.notifyListener(object0);
        }
        catch(RuntimeException runtimeException0) {
            listenerHolder$Notifier0.onNotifyListenerFailed();
            throw runtimeException0;
        }
    }
}

