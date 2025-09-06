package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.room.a;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

public final class zzey implements ServiceConnection {
    public final String a;
    public final zzez b;

    public zzey(zzez zzez0, String s) {
        this.b = zzez0;
        this.a = s;
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        zzfr zzfr0 = this.b.a;
        if(iBinder0 != null) {
            try {
                zzbr zzbr0 = zzbq.zzb(iBinder0);
                if(zzbr0 == null) {
                    zzfr0.zzay().zzk().zza("Install Referrer Service implementation was not found");
                    return;
                }
                zzfr0.zzay().zzj().zza("Install Referrer Service connected");
                zzfr0.zzaz().zzp(new f(this, zzbr0, this));
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            zzfr0.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", runtimeException0);
            return;
        }
        a.A(zzfr0, "Install Referrer connection returned with null binder");
    }

    @Override  // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName0) {
        a.B(this.b.a, "Install Referrer Service disconnected");
    }
}

