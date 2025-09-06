package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

public final class n extends BroadcastReceiver {
    public final zzkt a;
    public boolean b;
    public boolean c;

    public n(zzkt zzkt0) {
        Preconditions.checkNotNull(zzkt0);
        this.a = zzkt0;
    }

    public final void a() {
        zzkt zzkt0 = this.a;
        zzkt0.b();
        zzkt0.zzaz().zzg();
        zzkt0.zzaz().zzg();
        if(this.b) {
            zzkt0.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            Context context0 = zzkt0.zzau();
            try {
                context0.unregisterReceiver(this);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzkt0.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", illegalArgumentException0);
            }
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        zzkt zzkt0 = this.a;
        zzkt0.b();
        String s = intent0.getAction();
        zzkt0.zzay().zzj().zzb("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = zzkt0.zzl().zza();
            if(this.c != z) {
                this.c = z;
                zzkt0.zzaz().zzp(new n1(this, z));
            }
            return;
        }
        zzkt0.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", s);
    }
}

