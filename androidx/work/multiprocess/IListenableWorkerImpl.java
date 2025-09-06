package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IListenableWorkerImpl extends IInterface {
    public static class Default implements IListenableWorkerImpl {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IListenableWorkerImpl
        public void interrupt(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IListenableWorkerImpl
        public void startWork(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {
        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IListenableWorkerImpl");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IListenableWorkerImpl asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            if(iInterface0 != null && iInterface0 instanceof IListenableWorkerImpl) {
                return (IListenableWorkerImpl)iInterface0;
            }
            IListenableWorkerImpl iListenableWorkerImpl0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            iListenableWorkerImpl0.a = iBinder0;
            return iListenableWorkerImpl0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            }
            switch(v) {
                case 1: {
                    this.startWork(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 2: {
                    this.interrupt(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static final String DESCRIPTOR;

    static {
        IListenableWorkerImpl.DESCRIPTOR = "androidx.work.multiprocess.IListenableWorkerImpl";
    }

    void interrupt(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void startWork(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;
}

