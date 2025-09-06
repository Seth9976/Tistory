package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class b implements ICustomTabsService {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final Bundle extraCommand(String s, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
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
            return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback0, Uri uri0, Bundle bundle0, List list0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            boolean z = true;
            if(uri0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                uri0.writeToParcel(parcel0, 0);
            }
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            parcel0.writeTypedList(list0);
            this.a.transact(4, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) {
                z = false;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean newSession(ICustomTabsCallback iCustomTabsCallback0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            boolean z = false;
            this.a.transact(3, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() != 0) {
                z = true;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final int postMessage(ICustomTabsCallback iCustomTabsCallback0, String s, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            parcel0.writeString(s);
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(8, parcel0, parcel1, 0);
            parcel1.readException();
            return parcel1.readInt();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback0, Uri uri0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            boolean z = true;
            if(uri0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                uri0.writeToParcel(parcel0, 0);
            }
            this.a.transact(7, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) {
                z = false;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback0, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            boolean z = true;
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(6, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) {
                z = false;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback0, int v, Uri uri0, Bundle bundle0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeStrongBinder((iCustomTabsCallback0 == null ? null : iCustomTabsCallback0.asBinder()));
            parcel0.writeInt(v);
            boolean z = true;
            if(uri0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                uri0.writeToParcel(parcel0, 0);
            }
            if(bundle0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                bundle0.writeToParcel(parcel0, 0);
            }
            this.a.transact(9, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() == 0) {
                z = false;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }

    @Override  // android.support.customtabs.ICustomTabsService
    public final boolean warmup(long v) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcel0.writeLong(v);
            boolean z = false;
            this.a.transact(2, parcel0, parcel1, 0);
            parcel1.readException();
            if(parcel1.readInt() != 0) {
                z = true;
            }
            return z;
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

