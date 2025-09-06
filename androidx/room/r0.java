package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

public final class r0 implements IMultiInstanceInvalidationCallback {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.room.IMultiInstanceInvalidationCallback
    public final void onInvalidation(String[] arr_s) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            parcel0.writeStringArray(arr_s);
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

