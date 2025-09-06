package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {
    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean z, boolean z1) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
        public Stub() {
            this.attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IUnusedAppRestrictionsBackportCallback asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            if(iInterface0 != null && iInterface0 instanceof IUnusedAppRestrictionsBackportCallback) {
                return (IUnusedAppRestrictionsBackportCallback)iInterface0;
            }
            IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            iUnusedAppRestrictionsBackportCallback0.a = iBinder0;
            return iUnusedAppRestrictionsBackportCallback0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
            }
            boolean z = false;
            if(v == 0x5F4E5446) {
                parcel1.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback");
                return true;
            }
            if(v != 1) {
                return super.onTransact(v, parcel0, parcel1, v1);
            }
            boolean z1 = parcel0.readInt() != 0;
            if(parcel0.readInt() != 0) {
                z = true;
            }
            this.onIsPermissionRevocationEnabledForAppResult(z1, z);
            return true;
        }
    }

    public static final String DESCRIPTOR;

    static {
        IUnusedAppRestrictionsBackportCallback.DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean arg1, boolean arg2) throws RemoteException;
}

