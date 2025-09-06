package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {
    public final IBinder a;
    public final String b;

    public zza(IBinder iBinder0, String s) {
        this.a = iBinder0;
        this.b = s;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final Parcel zzB(int v, Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.a.transact(v, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1;
        }
        catch(RuntimeException runtimeException0) {
            parcel1.recycle();
            throw runtimeException0;
        }
        finally {
            parcel0.recycle();
        }
    }

    public final void zzC(int v, Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.a.transact(1, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel0.recycle();
            parcel1.recycle();
        }
    }

    public final void zzD(int v, Parcel parcel0) throws RemoteException {
        try {
            this.a.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    public final Parcel zza() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.b);
        return parcel0;
    }
}

