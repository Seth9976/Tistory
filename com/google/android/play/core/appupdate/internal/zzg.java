package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzb
    public final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 2: {
                Bundle bundle0 = (Bundle)zzc.zza(parcel0, Bundle.CREATOR);
                zzc.zzb(parcel0);
                this.zzc(bundle0);
                return true;
            }
            case 3: {
                Bundle bundle1 = (Bundle)zzc.zza(parcel0, Bundle.CREATOR);
                zzc.zzb(parcel0);
                this.zzb(bundle1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

