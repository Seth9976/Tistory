package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class a implements IResultReceiver {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // android.support.v4.os.IResultReceiver
    public final void send(int v, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            parcel0.writeInt(v);
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

