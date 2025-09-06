package com.google.android.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class a implements IInterface {
    public final IBinder a;
    public final String b;

    public a(IBinder iBinder0, String s) {
        this.a = iBinder0;
        this.b = s;
    }

    public final Parcel a() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.b);
        return parcel0;
    }

    public final Parcel a(Parcel parcel0) throws RemoteException {
        Parcel parcel1 = Parcel.obtain();
        try {
            this.a.transact(1, parcel0, parcel1, 0);
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

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

