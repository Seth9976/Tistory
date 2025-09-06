package androidx.core.app.unusedapprestrictions;

import android.os.IBinder;
import android.os.Parcel;

public final class a implements IUnusedAppRestrictionsBackportCallback {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
    public final void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z1) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            parcel0.writeInt(((int)z));
            parcel0.writeInt(((int)z1));
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

