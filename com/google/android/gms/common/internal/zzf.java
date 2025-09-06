package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzf extends h {
    public final BaseGmsClient e;
    @Nullable
    public final IBinder zze;

    @BinderThread
    public zzf(BaseGmsClient baseGmsClient0, @Nullable int v, @Nullable IBinder iBinder0, Bundle bundle0) {
        this.e = baseGmsClient0;
        super(baseGmsClient0, v, bundle0);
        this.zze = iBinder0;
    }

    @Override  // com.google.android.gms.common.internal.h
    public final void zzb(ConnectionResult connectionResult0) {
        BaseGmsClient baseGmsClient0 = this.e;
        BaseOnConnectionFailedListener baseGmsClient$BaseOnConnectionFailedListener0 = baseGmsClient0.u;
        if(baseGmsClient$BaseOnConnectionFailedListener0 != null) {
            baseGmsClient$BaseOnConnectionFailedListener0.onConnectionFailed(connectionResult0);
        }
        baseGmsClient0.onConnectionFailed(connectionResult0);
    }

    @Override  // com.google.android.gms.common.internal.h
    public final boolean zzd() {
        String s;
        try {
            Preconditions.checkNotNull(this.zze);
            s = this.zze.getInterfaceDescriptor();
        }
        catch(RemoteException unused_ex) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
        BaseGmsClient baseGmsClient0 = this.e;
        if(!baseGmsClient0.getServiceDescriptor().equals(s)) {
            Log.w("GmsClient", "service descriptor mismatch: " + baseGmsClient0.getServiceDescriptor() + " vs. " + s);
            return false;
        }
        IInterface iInterface0 = baseGmsClient0.createServiceInterface(this.zze);
        if(iInterface0 != null && (BaseGmsClient.b(baseGmsClient0, 2, 4, iInterface0) || BaseGmsClient.b(baseGmsClient0, 3, 4, iInterface0))) {
            baseGmsClient0.y = null;
            BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0 = baseGmsClient0.t;
            if(baseGmsClient$BaseConnectionCallbacks0 != null) {
                baseGmsClient$BaseConnectionCallbacks0.onConnected(null);
            }
            return true;
        }
        return false;
    }
}

