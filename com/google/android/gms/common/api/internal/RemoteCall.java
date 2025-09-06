package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface RemoteCall {
    @KeepForSdk
    void accept(@NonNull Object arg1, @NonNull Object arg2) throws RemoteException;
}

