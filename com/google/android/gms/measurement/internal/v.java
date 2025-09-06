package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;
import jeb.synthetic.FIN;

public final class v extends Thread {
    public final Object a;
    public final AbstractQueue b;
    public boolean c;
    public final zzfo d;

    public v(zzfo zzfo0, String s, BlockingQueue blockingQueue0) {
        this.d = zzfo0;
        super();
        this.c = false;
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(blockingQueue0);
        this.a = new Object();
        this.b = (AbstractQueue)blockingQueue0;
        this.setName(s);
    }

    public final void a() {
        synchronized(this.d.h) {
            if(!this.c) {
                this.d.i.release();
                this.d.h.notifyAll();
                zzfo zzfo0 = this.d;
                if(this == zzfo0.b) {
                    zzfo0.b = null;
                }
                else if(this == zzfo0.c) {
                    zzfo0.c = null;
                }
                else {
                    zzfo0.zzt.zzay().zzd().zza("Current scheduler thread is neither worker nor network");
                }
                this.c = true;
            }
        }
    }

    @Override
    public final void run() {
        for(boolean z = false; !z; z = true) {
            try {
                this.d.i.acquire();
            }
            catch(InterruptedException interruptedException0) {
                this.d.zzt.zzay().zzk().zzb(this.getName() + " was interrupted", interruptedException0);
            }
        }
        int v = FIN.finallyOpen$NT();
        int v1 = Process.getThreadPriority(Process.myTid());
        while(true) {
            u u0 = (u)this.b.poll();
            if(u0 == null) {
                Object object0 = this.a;
                __monitor_enter(object0);
                try {
                    if(this.b.peek() == null) {
                        this.d.getClass();
                        try {
                            this.a.wait(30000L);
                        }
                        catch(InterruptedException interruptedException1) {
                            this.d.zzt.zzay().zzk().zzb(this.getName() + " was interrupted", interruptedException1);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    __monitor_exit(object0);
                    FIN.finallyExec$NT(v);
                    throw throwable0;
                }
                __monitor_exit(object0);
                Object object1 = this.d.h;
                __monitor_enter(object1);
                try {
                    if(this.b.peek() == null) {
                        this.a();
                        goto label_38;
                    }
                    goto label_43;
                }
                catch(Throwable throwable1) {
                    __monitor_exit(object1);
                    FIN.finallyExec$NT(v);
                    throw throwable1;
                }
            label_38:
                __monitor_exit(object1);
                FIN.finallyCodeBegin$NT(v);
                this.a();
                FIN.finallyCodeEnd$NT(v);
                return;
            label_43:
                __monitor_exit(object1);
            }
            else {
                Process.setThreadPriority((u0.b ? v1 : 10));
                u0.run();
            }
        }
    }
}

