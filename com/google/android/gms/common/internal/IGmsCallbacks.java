package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int arg1, @NonNull IBinder arg2, @NonNull Bundle arg3) throws RemoteException;

    void zzb(int arg1, @NonNull Bundle arg2) throws RemoteException;

    void zzc(int arg1, IBinder arg2, zzj arg3) throws RemoteException;
}

