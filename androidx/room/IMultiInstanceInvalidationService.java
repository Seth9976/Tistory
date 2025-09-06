package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IMultiInstanceInvalidationService extends IInterface {
    public static class Default implements IMultiInstanceInvalidationService {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int v, String[] arr_s) throws RemoteException {
        }

        @Override  // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, String s) throws RemoteException {
            return 0;
        }

        @Override  // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback0, int v) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        public Stub() {
            this.attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IMultiInstanceInvalidationService asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if(iInterface0 != null && iInterface0 instanceof IMultiInstanceInvalidationService) {
                return (IMultiInstanceInvalidationService)iInterface0;
            }
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService0 = new s0();  // 初始化器: Ljava/lang/Object;-><init>()V
            iMultiInstanceInvalidationService0.a = iBinder0;
            return iMultiInstanceInvalidationService0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            switch(v) {
                case 1: {
                    int v2 = this.registerCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel0.readStrongBinder()), parcel0.readString());
                    parcel1.writeNoException();
                    parcel1.writeInt(v2);
                    return true;
                }
                case 2: {
                    this.unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel0.readStrongBinder()), parcel0.readInt());
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    this.broadcastInvalidation(parcel0.readInt(), parcel0.createStringArray());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.room.IMultiInstanceInvalidationService");
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
        IMultiInstanceInvalidationService.DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationService";
    }

    void broadcastInvalidation(int arg1, String[] arg2) throws RemoteException;

    int registerCallback(IMultiInstanceInvalidationCallback arg1, String arg2) throws RemoteException;

    void unregisterCallback(IMultiInstanceInvalidationCallback arg1, int arg2) throws RemoteException;
}

