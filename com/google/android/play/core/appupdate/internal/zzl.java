package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.appcompat.app.e0;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Set;

public abstract class zzl {
    public final IntentFilter a;
    public final Context b;
    public e0 c;
    protected final zzm zza;
    protected final Set zzb;

    public zzl(zzm zzm0, IntentFilter intentFilter0, Context context0) {
        this.zzb = new HashSet();
        this.c = null;
        this.zza = zzm0;
        this.a = intentFilter0;
        this.b = zzz.zza(context0);
    }

    public final void a() {
        Context context0 = this.b;
        if(!this.zzb.isEmpty() && this.c == null) {
            e0 e00 = new e0(this, 1);
            this.c = e00;
            IntentFilter intentFilter0 = this.a;
            if(Build.VERSION.SDK_INT >= 33) {
                context0.registerReceiver(e00, intentFilter0, 2);
            }
            else {
                context0.registerReceiver(e00, intentFilter0);
            }
        }
        if(this.zzb.isEmpty()) {
            e0 e01 = this.c;
            if(e01 != null) {
                context0.unregisterReceiver(e01);
                this.c = null;
            }
        }
    }

    public abstract void zza(Context arg1, Intent arg2);

    public final void zzb(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.zza.zzd("registerListener", new Object[0]);
            zzac.zza(stateUpdatedListener0, "Registered Play Core listener should not be null.");
            this.zzb.add(stateUpdatedListener0);
            this.a();
        }
    }

    public final void zzc(StateUpdatedListener stateUpdatedListener0) {
        synchronized(this) {
            this.zza.zzd("unregisterListener", new Object[0]);
            zzac.zza(stateUpdatedListener0, "Unregistered Play Core listener should not be null.");
            this.zzb.remove(stateUpdatedListener0);
            this.a();
        }
    }

    public final void zzd(Object object0) {
        synchronized(this) {
            for(Object object1: new HashSet(this.zzb)) {
                ((StateUpdatedListener)object1).onStateUpdate(object0);
            }
        }
    }
}

