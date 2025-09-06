package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;

public final class j extends zzi {
    public final BaseGmsClient a;

    public j(BaseGmsClient baseGmsClient0, Looper looper0) {
        this.a = baseGmsClient0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        BaseGmsClient baseGmsClient0 = this.a;
        if(baseGmsClient0.zzd.get() != message0.arg1) {
            if(message0.what != 1 && message0.what != 2 && message0.what != 7) {
                return;
            }
            zzc zzc0 = (zzc)message0.obj;
            zzc0.zzc();
            zzc0.zzg();
            return;
        }
        if(message0.what != 1 && message0.what != 4 && message0.what != 7 && message0.what != 5 || baseGmsClient0.isConnecting()) {
            PendingIntent pendingIntent0 = null;
            switch(message0.what) {
                case 2: {
                    if(!baseGmsClient0.isConnected()) {
                        zzc zzc1 = (zzc)message0.obj;
                        zzc1.zzc();
                        zzc1.zzg();
                        return;
                    }
                    break;
                }
                case 3: {
                    Object object0 = message0.obj;
                    if(object0 instanceof PendingIntent) {
                        pendingIntent0 = (PendingIntent)object0;
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(message0.arg2, pendingIntent0);
                    baseGmsClient0.zzc.onReportServiceBinding(connectionResult2);
                    baseGmsClient0.onConnectionFailed(connectionResult2);
                    return;
                }
                case 4: {
                    baseGmsClient0.y = new ConnectionResult(message0.arg2);
                    if(BaseGmsClient.c(baseGmsClient0) && !baseGmsClient0.z) {
                        baseGmsClient0.d(null, 3);
                        return;
                    }
                    ConnectionResult connectionResult0 = baseGmsClient0.y == null ? new ConnectionResult(8) : baseGmsClient0.y;
                    baseGmsClient0.zzc.onReportServiceBinding(connectionResult0);
                    baseGmsClient0.onConnectionFailed(connectionResult0);
                    return;
                }
                case 5: {
                    ConnectionResult connectionResult1 = baseGmsClient0.y == null ? new ConnectionResult(8) : baseGmsClient0.y;
                    baseGmsClient0.zzc.onReportServiceBinding(connectionResult1);
                    baseGmsClient0.onConnectionFailed(connectionResult1);
                    return;
                }
                case 6: {
                    baseGmsClient0.d(null, 5);
                    BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0 = baseGmsClient0.t;
                    if(baseGmsClient$BaseConnectionCallbacks0 != null) {
                        baseGmsClient$BaseConnectionCallbacks0.onConnectionSuspended(message0.arg2);
                    }
                    baseGmsClient0.onConnectionSuspended(message0.arg2);
                    BaseGmsClient.b(baseGmsClient0, 5, 1, null);
                    return;
                }
            }
            int v = message0.what;
            if(v != 1 && v != 2 && v != 7) {
                Log.wtf("GmsClient", "Don\'t know how to handle message: " + v, new Exception());
                return;
            }
            ((zzc)message0.obj).zze();
            return;
        }
        zzc zzc2 = (zzc)message0.obj;
        zzc2.zzc();
        zzc2.zzg();
    }
}

