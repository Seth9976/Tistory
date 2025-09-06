package android.support.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class c implements IPostMessageService {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // android.support.customtabs.IPostMessageService
    public final void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback0, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.IPostMessageService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.IPostMessageService
    public final void onPostMessage(ICustomTabsCallback iCustomTabsCallback0, String s, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.IPostMessageService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            parcel0.writeString(s);
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(3, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

