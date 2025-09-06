package com.google.android.gms.internal.measurement;

import a5.b;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbz extends zzce {
    public final AtomicReference a;
    public boolean b;

    public zzbz() {
        this.a = new AtomicReference();
    }

    public final Bundle zzb(long v) {
        synchronized(this.a) {
            if(!this.b) {
                try {
                    this.a.wait(v);
                }
                catch(InterruptedException unused_ex) {
                    return null;
                }
            }
        }
        return (Bundle)this.a.get();
    }

    public final Long zzc(long v) {
        return (Long)zzbz.zzf(this.zzb(v), Long.class);
    }

    public final String zzd(long v) {
        return (String)zzbz.zzf(this.zzb(v), String.class);
    }

    @Override  // com.google.android.gms.internal.measurement.zzcf
    public final void zze(Bundle bundle0) {
        synchronized(this.a) {
            try {
                this.a.set(bundle0);
                this.b = true;
            }
            catch(Throwable throwable0) {
                this.a.notify();
                throw throwable0;
            }
        }
        this.a.notify();
    }

    public static final Object zzf(Bundle bundle0, Class class0) {
        if(bundle0 != null) {
            Object object0 = bundle0.get("r");
            if(object0 != null) {
                try {
                    return class0.cast(object0);
                }
                catch(ClassCastException classCastException0) {
                    Log.w("AM", b.n("Unexpected object type. Expected, Received: ", class0.getCanonicalName(), ", ", object0.getClass().getCanonicalName()), classCastException0);
                    throw classCastException0;
                }
            }
        }
        return null;
    }
}

