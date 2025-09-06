package com.google.android.gms.internal.ads_identifier;

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
        parcel0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return parcel0;
    }

    public final Parcel zzb(int v, Parcel parcel0) throws RemoteException {
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
}

