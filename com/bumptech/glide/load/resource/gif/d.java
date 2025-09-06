package com.bumptech.glide.load.resource.gif;

import android.content.ComponentName;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.zzn;
import java.util.HashMap;

public final class d implements Handler.Callback {
    public final int a;
    public final Object b;

    public d(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(this.a != 0) {
            switch(message0.what) {
                case 0: {
                    HashMap hashMap0 = ((l)this.b).e;
                    synchronized(hashMap0) {
                        zzn zzn0 = (zzn)message0.obj;
                        k k0 = (k)((l)this.b).e.get(zzn0);
                        if(k0 != null && k0.a.isEmpty()) {
                            if(k0.c) {
                                k0.g.g.removeMessages(1, k0.e);
                                k0.g.i.unbindService(k0.g.f, k0);
                                k0.c = false;
                                k0.b = 2;
                            }
                            ((l)this.b).e.remove(zzn0);
                        }
                        return true;
                    }
                }
                case 1: {
                    HashMap hashMap1 = ((l)this.b).e;
                    synchronized(hashMap1) {
                        zzn zzn1 = (zzn)message0.obj;
                        k k1 = (k)((l)this.b).e.get(zzn1);
                        if(k1 != null && k1.b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + zzn1, new Exception());
                            ComponentName componentName0 = k1.f == null ? zzn1.zzb() : k1.f;
                            if(componentName0 == null) {
                                String s = zzn1.zzd();
                                Preconditions.checkNotNull(s);
                                componentName0 = new ComponentName(s, "unknown");
                            }
                            k1.onServiceDisconnected(componentName0);
                        }
                        return true;
                    }
                }
                default: {
                    return false;
                }
            }
        }
        int v2 = message0.what;
        e e0 = (e)this.b;
        if(v2 == 1) {
            e0.b(((c)message0.obj));
            return true;
        }
        if(v2 == 2) {
            e0.d.clear(((c)message0.obj));
        }
        return false;
    }
}

