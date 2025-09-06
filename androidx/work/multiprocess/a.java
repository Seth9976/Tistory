package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.Parcel;

public final class a implements IListenableWorkerImpl {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.work.multiprocess.IListenableWorkerImpl
    public final void interrupt(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IListenableWorkerImpl
    public final void startWork(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IListenableWorkerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

