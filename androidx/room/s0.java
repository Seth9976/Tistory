package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

public final class s0 implements IMultiInstanceInvalidationService {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.room.IMultiInstanceInvalidationService
    public final void broadcastInvalidation(int v, String[] arr_s) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            parcel0.writeInt(v);
            parcel0.writeStringArray(arr_s);
            this.a.transact(3, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.room.IMultiInstanceInvalidationService
    public final int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, String s) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            parcel0.writeStrongInterface(iMultiInstanceInvalidationCallback0);
            parcel0.writeString(s);
            this.a.transact(1, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1.readInt();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // androidx.room.IMultiInstanceInvalidationService
    public final void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
            parcel0.writeStrongInterface(iMultiInstanceInvalidationCallback0);
            parcel0.writeInt(v);
            this.a.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

