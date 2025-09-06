package com.google.android.gms.common.internal.service;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zal extends zaa implements IInterface {
    public final void zae(zak zak0) throws RemoteException {
        Parcel parcel0 = this.zaa();
        zac.zad(parcel0, zak0);
        this.zad(1, parcel0);
    }
}

