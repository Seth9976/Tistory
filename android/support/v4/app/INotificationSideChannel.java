package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface INotificationSideChannel extends IInterface {
    public static class Default implements INotificationSideChannel {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // android.support.v4.app.INotificationSideChannel
        public void cancel(String s, int v, String s1) throws RemoteException {
        }

        @Override  // android.support.v4.app.INotificationSideChannel
        public void cancelAll(String s) throws RemoteException {
        }

        @Override  // android.support.v4.app.INotificationSideChannel
        public void notify(String s, int v, String s1, Notification notification0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {
        public Stub() {
            this.attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static INotificationSideChannel asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if(iInterface0 != null && iInterface0 instanceof INotificationSideChannel) {
                return (INotificationSideChannel)iInterface0;
            }
            INotificationSideChannel iNotificationSideChannel0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            iNotificationSideChannel0.a = iBinder0;
            return iNotificationSideChannel0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("android.support.v4.app.INotificationSideChannel");
            }
            switch(v) {
                case 1: {
                    String s = parcel0.readString();
                    int v2 = parcel0.readInt();
                    String s1 = parcel0.readString();
                    Parcelable.Creator parcelable$Creator0 = Notification.CREATOR;
                    this.notify(s, v2, s1, ((Notification)(parcel0.readInt() == 0 ? null : parcelable$Creator0.createFromParcel(parcel0))));
                    return true;
                }
                case 2: {
                    this.cancel(parcel0.readString(), parcel0.readInt(), parcel0.readString());
                    return true;
                }
                case 3: {
                    this.cancelAll(parcel0.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.v4.app.INotificationSideChannel");
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
        INotificationSideChannel.DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";
    }

    void cancel(String arg1, int arg2, String arg3) throws RemoteException;

    void cancelAll(String arg1) throws RemoteException;

    void notify(String arg1, int arg2, String arg3, Notification arg4) throws RemoteException;
}

