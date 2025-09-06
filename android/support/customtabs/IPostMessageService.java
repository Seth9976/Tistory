package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IPostMessageService extends IInterface {
    public static abstract class Stub extends Binder implements IPostMessageService {
        public Stub() {
            this.attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IPostMessageService asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.IPostMessageService");
            if(iInterface0 != null && iInterface0 instanceof IPostMessageService) {
                return (IPostMessageService)iInterface0;
            }
            IPostMessageService iPostMessageService0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
            iPostMessageService0.a = iBinder0;
            return iPostMessageService0;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            Bundle bundle0 = null;
            switch(v) {
                case 2: {
                    parcel0.enforceInterface("android.support.customtabs.IPostMessageService");
                    ICustomTabsCallback iCustomTabsCallback0 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel0.readStrongBinder());
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onMessageChannelReady(iCustomTabsCallback0, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 3: {
                    parcel0.enforceInterface("android.support.customtabs.IPostMessageService");
                    ICustomTabsCallback iCustomTabsCallback1 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(parcel0.readStrongBinder());
                    String s = parcel0.readString();
                    if(parcel0.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(parcel0);
                    }
                    this.onPostMessage(iCustomTabsCallback1, s, bundle0);
                    parcel1.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("android.support.customtabs.IPostMessageService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    void onMessageChannelReady(ICustomTabsCallback arg1, Bundle arg2) throws RemoteException;

    void onPostMessage(ICustomTabsCallback arg1, String arg2, Bundle arg3) throws RemoteException;
}

