package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod {
    public final ListenerKey a;

    @KeepForSdk
    public UnregisterListenerMethod(@NonNull ListenerKey listenerHolder$ListenerKey0) {
        this.a = listenerHolder$ListenerKey0;
    }

    @NonNull
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.a;
    }

    @KeepForSdk
    public abstract void unregisterListener(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;
}

