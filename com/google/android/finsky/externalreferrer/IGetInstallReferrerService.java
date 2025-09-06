package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

public interface IGetInstallReferrerService extends IInterface {
    public static abstract class Stub extends b implements IGetInstallReferrerService {
        public static class Proxy extends a implements IGetInstallReferrerService {
            @Override  // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle a(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = this.a();
                c.a(parcel0, bundle0);
                Parcel parcel1 = this.a(parcel0);
                Bundle bundle1 = (Bundle)c.a(parcel1, Bundle.CREATOR);
                parcel1.recycle();
                return bundle1;
            }
        }

        public Stub() {
            super("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        public static IGetInstallReferrerService a(IBinder iBinder0) {
            if(iBinder0 != null) {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return iInterface0 instanceof IGetInstallReferrerService ? ((IGetInstallReferrerService)iInterface0) : new Proxy(iBinder0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");  // 初始化器: Lcom/google/android/a/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
            }
            return null;
        }
    }

    Bundle a(Bundle arg1) throws RemoteException;
}

