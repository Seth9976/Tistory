package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY})
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override  // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback0) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {
        public Stub() {
            this.attachInterface(this, "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IUnusedAppRestrictionsBackportService asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            if(iInterface0 != null && iInterface0 instanceof IUnusedAppRestrictionsBackportService) {
                return (IUnusedAppRestrictionsBackportService)iInterface0;
            }
            IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportService0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
            iUnusedAppRestrictionsBackportService0.a = iBinder0;
            return iUnusedAppRestrictionsBackportService0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            if(v >= 1 && v <= 0xFFFFFF) {
                parcel0.enforceInterface("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
            }
            switch(v) {
                case 1: {
                    this.isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService");
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
        IUnusedAppRestrictionsBackportService.DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
    }

    void isPermissionRevocationEnabledForApp(IUnusedAppRestrictionsBackportCallback arg1) throws RemoteException;
}

