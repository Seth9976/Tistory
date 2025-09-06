package com.google.android.gms.common.internal;

import android.util.Log;

public abstract class zzc {
    public Object a;
    public boolean b;
    public final BaseGmsClient c;

    public zzc(BaseGmsClient baseGmsClient0, Object object0) {
        this.c = baseGmsClient0;
        super();
        this.a = object0;
        this.b = false;
    }

    public abstract void zza(Object arg1);

    public abstract void zzc();

    public final void zze() {
        Object object0;
        synchronized(this) {
            object0 = this.a;
            if(this.b) {
                Log.w("GmsClient", "Callback proxy " + this.toString() + " being reused. This is not safe.");
            }
        }
        if(object0 != null) {
            this.zza(object0);
        }
        synchronized(this) {
            this.b = true;
        }
        this.zzg();
    }

    public final void zzf() {
        synchronized(this) {
            this.a = null;
        }
    }

    public final void zzg() {
        this.zzf();
        synchronized(this.c.q) {
            this.c.q.remove(this);
        }
    }
}

