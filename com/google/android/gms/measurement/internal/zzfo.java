package com.google.android.gms.measurement.internal;

import androidx.room.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfo extends b0 {
    public v b;
    public v c;
    public final PriorityBlockingQueue d;
    public final LinkedBlockingQueue e;
    public final t f;
    public final t g;
    public final Object h;
    public final Semaphore i;
    public static final AtomicLong j;

    static {
        zzfo.j = new AtomicLong(0x8000000000000000L);
    }

    public zzfo(zzfr zzfr0) {
        super(zzfr0);
        this.h = new Object();
        this.i = new Semaphore(2);
        this.d = new PriorityBlockingQueue();
        this.e = new LinkedBlockingQueue();
        this.f = new t(this, "Thread death: Uncaught exception on worker thread");
        this.g = new t(this, "Thread death: Uncaught exception on network thread");
    }

    public final Object a(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.zzt.zzaz().zzp(runnable0);
            try {
                atomicReference0.wait(v);
            }
            catch(InterruptedException unused_ex) {
                this.zzt.zzay().zzk().zza("Interrupted waiting for " + s);
                return null;
            }
        }
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            this.zzt.zzay().zzk().zza("Timed out waiting for " + s);
        }
        return object0;
    }

    public final void b(u u0) {
        synchronized(this.h) {
            this.d.add(u0);
            v v1 = this.b;
            if(v1 == null) {
                v v2 = new v(this, "Measurement Worker", this.d);
                this.b = v2;
                v2.setUncaughtExceptionHandler(this.f);
                this.b.start();
            }
            else {
                synchronized(v1.a) {
                    v1.a.notifyAll();
                }
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.a0
    public final void zzax() {
        if(Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override  // com.google.android.gms.measurement.internal.b0
    public final boolean zzf() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.a0
    public final void zzg() {
        if(Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable0) throws IllegalStateException {
        this.zzu();
        Preconditions.checkNotNull(callable0);
        Future future0 = new u(this, callable0, false);
        if(Thread.currentThread() == this.b) {
            if(!this.d.isEmpty()) {
                a.A(this.zzt, "Callable skipped the worker queue.");
            }
            ((FutureTask)future0).run();
            return future0;
        }
        this.b(((u)future0));
        return future0;
    }

    public final Future zzi(Callable callable0) throws IllegalStateException {
        this.zzu();
        Preconditions.checkNotNull(callable0);
        Future future0 = new u(this, callable0, true);
        if(Thread.currentThread() == this.b) {
            ((FutureTask)future0).run();
            return future0;
        }
        this.b(((u)future0));
        return future0;
    }

    public final void zzo(Runnable runnable0) throws IllegalStateException {
        this.zzu();
        Preconditions.checkNotNull(runnable0);
        u u0 = new u(this, runnable0, false, "Task exception on network thread");
        synchronized(this.h) {
            this.e.add(u0);
            v v1 = this.c;
            if(v1 == null) {
                v v2 = new v(this, "Measurement Network", this.e);
                this.c = v2;
                v2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            }
            else {
                synchronized(v1.a) {
                    v1.a.notifyAll();
                }
            }
        }
    }

    public final void zzp(Runnable runnable0) throws IllegalStateException {
        this.zzu();
        Preconditions.checkNotNull(runnable0);
        this.b(new u(this, runnable0, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable0) throws IllegalStateException {
        this.zzu();
        Preconditions.checkNotNull(runnable0);
        this.b(new u(this, runnable0, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.b;
    }
}

