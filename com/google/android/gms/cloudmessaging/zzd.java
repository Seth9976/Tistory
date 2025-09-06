package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.m;

public final class zzd implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Messenger a;

    static {
        zzd.CREATOR = new m(5);
    }

    public zzd(IBinder iBinder0) {
        this.a = new Messenger(iBinder0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        try {
            return this.zza().equals(((zzd)object0).zza());
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        return this.zza().hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.a.getClass();
        parcel0.writeStrongBinder(this.a.getBinder());
    }

    public final IBinder zza() {
        this.a.getClass();
        return this.a.getBinder();
    }

    public final void zzb(Message message0) throws RemoteException {
        this.a.getClass();
        this.a.send(message0);
    }
}

