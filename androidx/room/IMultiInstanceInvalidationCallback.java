package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(String[] arr_s) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {
        public Stub() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IMultiInstanceInvalidationCallback asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if(iInterface0 != null && iInterface0 instanceof IMultiInstanceInvalidationCallback) {
                return (IMultiInstanceInvalidationCallback)iInterface0;
            }
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0 = new r0();  // 初始化器: Ljava/lang/Object;-><init>()V
            iMultiInstanceInvalidationCallback0.a = iBinder0;
            return iMultiInstanceInvalidationCallback0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            switch(v) {
                case 1: {
                    this.onInvalidation(parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationCallback");
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
        IMultiInstanceInvalidationCallback.DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationCallback";
    }

    void onInvalidation(String[] arg1) throws RemoteException;
}

