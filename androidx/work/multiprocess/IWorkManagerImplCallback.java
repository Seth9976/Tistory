package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IWorkManagerImplCallback extends IInterface {
    public static class Default implements IWorkManagerImplCallback {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onFailure(String s) throws RemoteException {
        }

        @Override  // androidx.work.multiprocess.IWorkManagerImplCallback
        public void onSuccess(byte[] arr_b) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {
        public Stub() {
            this.attachInterface(this, "androidx.work.multiprocess.IWorkManagerImplCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IWorkManagerImplCallback asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if(iInterface0 != null && iInterface0 instanceof IWorkManagerImplCallback) {
                return (IWorkManagerImplCallback)iInterface0;
            }
            IWorkManagerImplCallback iWorkManagerImplCallback0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
            iWorkManagerImplCallback0.a = iBinder0;
            return iWorkManagerImplCallback0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            }
            switch(v) {
                case 1: {
                    this.onSuccess(parcel0.createByteArray());
                    return true;
                }
                case 2: {
                    this.onFailure(parcel0.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
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
        IWorkManagerImplCallback.DESCRIPTOR = "androidx.work.multiprocess.IWorkManagerImplCallback";
    }

    void onFailure(String arg1) throws RemoteException;

    void onSuccess(byte[] arg1) throws RemoteException;
}

