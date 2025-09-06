package com.google.android.play.core.appupdate.internal;

public final class a extends zzn {
    public final int b;
    public final Object c;

    public a(Object object0, int v) {
        this.b = v;
        this.c = object0;
        super();
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzn
    public final void zza() {
        if(this.b != 0) {
            ((c)this.c).a.b.zzd("unlinkToDeath", new Object[0]);
            ((c)this.c).a.m.asBinder().unlinkToDeath(((c)this.c).a.j, 0);
            ((c)this.c).a.m = null;
            ((c)this.c).a.g = false;
            return;
        }
        synchronized(((zzx)this.c).f) {
            if(((zzx)this.c).k.get() > 0 && ((zzx)this.c).k.decrementAndGet() > 0) {
                ((zzx)this.c).b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzx zzx0 = (zzx)this.c;
            if(zzx0.m != null) {
                zzx0.b.zzd("Unbind from service.", new Object[0]);
                ((zzx)this.c).a.unbindService(((zzx)this.c).l);
                ((zzx)this.c).g = false;
                ((zzx)this.c).m = null;
                ((zzx)this.c).l = null;
            }
            ((zzx)this.c).b();
        }
    }
}

