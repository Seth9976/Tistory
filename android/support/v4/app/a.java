package android.support.v4.app;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

public final class a implements INotificationSideChannel {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // android.support.v4.app.INotificationSideChannel
    public final void cancel(String s, int v, String s1) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel0.writeString(s);
            parcel0.writeInt(v);
            parcel0.writeString(s1);
            this.a.transact(2, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // android.support.v4.app.INotificationSideChannel
    public final void cancelAll(String s) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel0.writeString(s);
            this.a.transact(3, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }

    @Override  // android.support.v4.app.INotificationSideChannel
    public final void notify(String s, int v, String s1, Notification notification0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            parcel0.writeString(s);
            parcel0.writeInt(v);
            parcel0.writeString(s1);
            if(notification0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                notification0.writeToParcel(parcel0, 0);
            }
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

