package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IResultReceiver2 extends IInterface {
    public static class Default implements IResultReceiver2 {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.v4.os.IResultReceiver2
        public void send(int v, Bundle bundle0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver2 {
        public Stub() {
            this.attachInterface(this, "android.support.v4.os.IResultReceiver2");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IResultReceiver2 asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.os.IResultReceiver2");
            if(iInterface0 != null && iInterface0 instanceof IResultReceiver2) {
                return (IResultReceiver2)iInterface0;
            }
            IResultReceiver2 iResultReceiver20 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            iResultReceiver20.a = iBinder0;
            return iResultReceiver20;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.os.IResultReceiver2");
            }
            switch(v) {
                case 1: {
                    int v2 = parcel0.readInt();
                    Parcelable.Creator parcelable$Creator0 = Bundle.CREATOR;
                    this.send(v2, ((Bundle)(parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0))));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.v4.os.IResultReceiver2");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    public static class _Parcel {
    }

    public static final String DESCRIPTOR;

    static {
        IResultReceiver2.DESCRIPTOR = "android.support.v4.os.IResultReceiver2";
    }

    void send(int arg1, Bundle arg2) throws RemoteException;
}

