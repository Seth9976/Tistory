package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzd extends zza implements zzf {
    @Override  // com.google.android.play.core.appupdate.internal.zzf
    public final void zzc(String s, Bundle bundle0, zzh zzh0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzc.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzh0));
        this.zzb(3, parcel0);
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzf
    public final void zzd(String s, Bundle bundle0, zzh zzh0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzc.zzc(parcel0, bundle0);
        parcel0.writeStrongBinder(((IBinder)zzh0));
        this.zzb(2, parcel0);
    }
}

