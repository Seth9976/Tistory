package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {
    public final IBinder a;

    public zza(IBinder iBinder0, String s) {
        this.a = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel zza() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return parcel0;
    }

    public final void zzb(int v, Parcel parcel0) throws RemoteException {
        try {
            this.a.transact(v, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

