package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

public final class i implements IGmsServiceBroker {
    public final IBinder a;

    public i(IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override  // com.google.android.gms.common.internal.IGmsServiceBroker
    public final void getService(IGmsCallbacks iGmsCallbacks0, GetServiceRequest getServiceRequest0) {
        Parcel parcel0 = Parcel.obtain();
        Parcel parcel1 = Parcel.obtain();
        try {
            parcel0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcel0.writeStrongBinder((iGmsCallbacks0 == null ? null : iGmsCallbacks0.asBinder()));
            if(getServiceRequest0 == null) {
                parcel0.writeInt(0);
            }
            else {
                parcel0.writeInt(1);
                zzm.a(getServiceRequest0, parcel0, 0);
            }
            this.a.transact(46, parcel0, parcel1, 0);
            parcel1.readException();
        }
        finally {
            parcel1.recycle();
            parcel0.recycle();
        }
    }
}

