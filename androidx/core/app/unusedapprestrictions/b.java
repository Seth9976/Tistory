package androidx.core.app.unusedapprestrictions;

import android.os.IBinder;
import android.os.Parcel;

public final class b implements IUnusedAppRestrictionsBackportService {
    public IBinder a;

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
    public final void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) {
        Parcel parcel0 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            parcel0.writeStrongInterface(iUnusedAppRestrictionsBackportCallback0);
            this.a.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

