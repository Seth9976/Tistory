package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

interface IMessengerCompat extends IInterface {
    public static class Impl extends Binder implements IMessengerCompat {
        @Override  // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            throw null;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, @NonNull Parcel parcel0, @Nullable Parcel parcel1, int v1) throws RemoteException {
            throw null;
        }

        @Override  // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@NonNull Message message0) throws RemoteException {
            throw null;
        }
    }

    public static class Proxy implements IMessengerCompat {
        @Override  // android.os.IInterface
        @NonNull
        public IBinder asBinder() {
            throw null;
        }

        @Override  // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@NonNull Message message0) throws RemoteException {
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            parcel0.writeInt(1);
            message0.writeToParcel(parcel0, 0);
            try {
                throw null;
            }
            catch(Throwable throwable0) {
                parcel0.recycle();
                throw throwable0;
            }
        }
    }

    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    void send(@NonNull Message arg1) throws RemoteException;
}

