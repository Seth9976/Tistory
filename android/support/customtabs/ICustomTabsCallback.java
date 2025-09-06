package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICustomTabsCallback extends IInterface {
    public static abstract class Stub extends Binder implements ICustomTabsCallback {
        public Stub() {
            this.attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ICustomTabsCallback asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if(iInterface0 != null && iInterface0 instanceof ICustomTabsCallback) {
                return (ICustomTabsCallback)iInterface0;
            }
            ICustomTabsCallback iCustomTabsCallback0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
            iCustomTabsCallback0.a = iBinder0;
            return iCustomTabsCallback0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            Bundle bundle0 = null;
            switch(v) {
                case 2: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int v3 = parcel0.readInt();
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onNavigationEvent(v3, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String s1 = parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.extraCallback(s1, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 4: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onMessageChannelReady(bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 5: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    String s = parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onPostMessage(s, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 6: {
                    parcel0.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    int v2 = parcel0.readInt();
                    Uri uri0 = parcel0.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(parcel0));
                    boolean z = parcel0.readInt() != 0;
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onRelationshipValidationResult(v2, uri0, z, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.customtabs.ICustomTabsCallback");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    void extraCallback(String arg1, Bundle arg2) throws RemoteException;

    void onMessageChannelReady(Bundle arg1) throws RemoteException;

    void onNavigationEvent(int arg1, Bundle arg2) throws RemoteException;

    void onPostMessage(String arg1, Bundle arg2) throws RemoteException;

    void onRelationshipValidationResult(int arg1, Uri arg2, boolean arg3, Bundle arg4) throws RemoteException;
}

