package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IWorkManagerImpl extends IInterface {
    public static class Default implements IWorkManagerImpl {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWork(IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelAllWorkByTag(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelUniqueWork(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void cancelWorkById(String s, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueContinuation(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void enqueueWorkRequests(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void queryWorkInfo(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void setForegroundAsync(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void setProgress(byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImpl
        public void updateUniquePeriodicWorkRequest(String s, byte[] arr_b, IWorkManagerImplCallback iWorkManagerImplCallback0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImpl {
        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IWorkManagerImpl");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IWorkManagerImpl asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImpl");
            if(iInterface0 != null && iInterface0 instanceof IWorkManagerImpl) {
                return (IWorkManagerImpl)iInterface0;
            }
            IWorkManagerImpl iWorkManagerImpl0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            iWorkManagerImpl0.a = iBinder0;
            return iWorkManagerImpl0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
            }
            if(v == 0x5F4E5446) {
                parcel1.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch(v) {
                case 1: {
                    this.enqueueWorkRequests(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 2: {
                    this.updateUniquePeriodicWorkRequest(parcel0.readString(), parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 3: {
                    this.enqueueContinuation(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 4: {
                    this.cancelWorkById(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 5: {
                    this.cancelAllWorkByTag(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 6: {
                    this.cancelUniqueWork(parcel0.readString(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 7: {
                    this.cancelAllWork(androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 8: {
                    this.queryWorkInfo(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 9: {
                    this.setProgress(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 10: {
                    this.setForegroundAsync(parcel0.createByteArray(), androidx.work.multiprocess.IWorkManagerImplCallback.Stub.asInterface(parcel0.readStrongBinder()));
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
        IWorkManagerImpl.DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImpl";
    }

    void cancelAllWork(IWorkManagerImplCallback arg1) throws RemoteException;

    void cancelAllWorkByTag(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void cancelUniqueWork(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void cancelWorkById(String arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void enqueueContinuation(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void enqueueWorkRequests(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void queryWorkInfo(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void setForegroundAsync(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void setProgress(byte[] arg1, IWorkManagerImplCallback arg2) throws RemoteException;

    void updateUniquePeriodicWorkRequest(String arg1, byte[] arg2, IWorkManagerImplCallback arg3) throws RemoteException;
}

