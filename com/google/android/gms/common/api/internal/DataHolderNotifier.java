package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public abstract class DataHolderNotifier implements Notifier {
    public final DataHolder a;

    @KeepForSdk
    public DataHolderNotifier(@NonNull DataHolder dataHolder0) {
        this.a = dataHolder0;
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public final void notifyListener(@NonNull Object object0) {
        this.notifyListener(object0, this.a);
    }

    @KeepForSdk
    public abstract void notifyListener(@NonNull Object arg1, @NonNull DataHolder arg2);

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    @KeepForSdk
    public void onNotifyListenerFailed() {
        DataHolder dataHolder0 = this.a;
        if(dataHolder0 != null) {
            dataHolder0.close();
        }
    }
}

