package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.Parcel;

public final class c implements IWorkManagerImplCallback {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onFailure(String s) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
            parcel0.writeString(s);
            this.a.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
    public final void onSuccess(byte[] arr_b) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImplCallback");
            parcel0.writeByteArray(arr_b);
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

