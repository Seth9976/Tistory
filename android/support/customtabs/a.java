package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class a implements ICustomTabsCallback {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void extraCallback(String s, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
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

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onMessageChannelReady(Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(4, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onNavigationEvent(int v, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcel0.writeInt(v);
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

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onPostMessage(String s, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcel0.writeString(s);
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(5, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsCallback
    public final void onRelationshipValidationResult(int v, Uri uri0, boolean z, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            parcel0.writeInt(v);
            if(uri0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                uri0.writeToParcel(parcel0, 0);
            }
            parcel0.writeInt(((int)z));
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(6, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

