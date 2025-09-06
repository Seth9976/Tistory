package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod {
    public final ListenerHolder a;
    public final Feature[] b;
    public final boolean c;
    public final int d;

    @KeepForSdk
    public RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0) {
        this(listenerHolder0, null, false, 0);
    }

    @KeepForSdk
    public RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0, @NonNull Feature[] arr_feature, boolean z) {
        this(listenerHolder0, arr_feature, z, 0);
    }

    @KeepForSdk
    public RegisterListenerMethod(@NonNull ListenerHolder listenerHolder0, @Nullable Feature[] arr_feature, boolean z, int v) {
        this.a = listenerHolder0;
        this.b = arr_feature;
        this.c = z;
        this.d = v;
    }

    @KeepForSdk
    public void clearListener() {
        this.a.clear();
    }

    @Nullable
    @KeepForSdk
    public ListenerKey getListenerKey() {
        return this.a.getListenerKey();
    }

    @Nullable
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return this.b;
    }

    @KeepForSdk
    public abstract void registerListener(@NonNull AnyClient arg1, @NonNull TaskCompletionSource arg2) throws RemoteException;

    public final int zaa() {
        return this.d;
    }

    public final boolean zab() {
        return this.c;
    }
}

