package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.Parcel;

public final class b implements IWorkManagerImpl {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(7, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelAllWorkByTag(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeString(s);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(5, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelUniqueWork(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeString(s);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(6, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void cancelWorkById(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeString(s);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(4, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueContinuation(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(3, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void enqueueWorkRequests(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void queryWorkInfo(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(8, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void setForegroundAsync(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(10, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void setProgress(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(9, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // androidx.work.multiprocess.IWorkManagerImpl
    public final void updateUniquePeriodicWorkRequest(String s, byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.work.multiprocess.IWorkManagerImpl");
            parcel0.writeString(s);
            parcel0.writeByteArray(arr_b);
            parcel0.writeStrongInterface(iWorkManagerImplCallback0);
            this.a.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

