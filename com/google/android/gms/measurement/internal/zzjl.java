package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzjl implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    public volatile boolean a;
    public volatile zzed b;
    public final zzjm c;

    public zzjl(zzjm zzjm0) {
        this.c = zzjm0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    @MainThread
    public final void onConnected(Bundle bundle0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized(this) {
            try {
                Preconditions.checkNotNull(this.b);
                zzdx zzdx0 = (zzdx)this.b.getService();
                this.c.zzt.zzaz().zzp(new b1(this, zzdx0, 1));
            }
            catch(DeadObjectException | IllegalStateException unused_ex) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzeh zzeh0 = this.c.zzt.zzl();
        if(zzeh0 != null) {
            zzeh0.zzk().zzb("Service connection failed", connectionResult0);
        }
        synchronized(this) {
            this.a = false;
            this.b = null;
        }
        this.c.zzt.zzaz().zzp(new c1(this, 1));
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    @MainThread
    public final void onConnectionSuspended(int v) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.c.zzt.zzay().zzc().zza("Service connection suspended");
        this.c.zzt.zzaz().zzp(new c1(this, 0));
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzdx zzdx0;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized(this) {
            if(iBinder0 == null) {
                this.a = false;
                this.c.zzt.zzay().zzd().zza("Service connected with null binder");
                return;
            }
            try {
                zzdx0 = null;
                String s = iBinder0.getInterfaceDescriptor();
                if("com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    zzdx zzdx1 = iInterface0 instanceof zzdx ? ((zzdx)iInterface0) : new zzdv(iBinder0);
                    zzdx0 = zzdx1;
                    this.c.zzt.zzay().zzj().zza("Bound to IMeasurementService interface");
                }
                else {
                    this.c.zzt.zzay().zzd().zzb("Got binder with a wrong descriptor", s);
                }
            }
            catch(RemoteException unused_ex) {
                this.c.zzt.zzay().zzd().zza("Service connect failed to get IMeasurementService");
            }
            if(zzdx0 == null) {
                try {
                    this.a = false;
                    ConnectionTracker.getInstance().unbindService(this.c.zzt.zzau(), this.c.b);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            else {
                this.c.zzt.zzaz().zzp(new b1(this, zzdx0, 0));
            }
        }
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName0) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.c.zzt.zzay().zzc().zza("Service disconnected");
        this.c.zzt.zzaz().zzp(new f(7, this, componentName0));
    }

    @WorkerThread
    public final void zzb(Intent intent0) {
        this.c.zzg();
        Context context0 = this.c.zzt.zzau();
        ConnectionTracker connectionTracker0 = ConnectionTracker.getInstance();
        synchronized(this) {
            if(this.a) {
                this.c.zzt.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            this.c.zzt.zzay().zzj().zza("Using local app measurement service");
            this.a = true;
            connectionTracker0.bindService(context0, intent0, this.c.b, 0x81);
        }
    }

    @WorkerThread
    public final void zzc() {
        this.c.zzg();
        Context context0 = this.c.zzt.zzau();
        synchronized(this) {
            if(this.a) {
                this.c.zzt.zzay().zzj().zza("Connection attempt already in progress");
                return;
            }
            if(this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                this.c.zzt.zzay().zzj().zza("Already awaiting connection attempt");
                return;
            }
            this.b = new zzed(context0, Looper.getMainLooper(), this, this);
            this.c.zzt.zzay().zzj().zza("Connecting to remote service");
            this.a = true;
            Preconditions.checkNotNull(this.b);
            this.b.checkAvailabilityAndConnect();
        }
    }

    @WorkerThread
    public final void zzd() {
        if(this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }
}

