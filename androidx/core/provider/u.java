package androidx.core.provider;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class u implements Runnable {
    public final AtomicReference a;
    public final Callable b;
    public final ReentrantLock c;
    public final AtomicBoolean d;
    public final Condition e;

    public u(AtomicReference atomicReference0, Callable callable0, ReentrantLock reentrantLock0, AtomicBoolean atomicBoolean0, Condition condition0) {
        this.a = atomicReference0;
        this.b = callable0;
        this.c = reentrantLock0;
        this.d = atomicBoolean0;
        this.e = condition0;
    }

    @Override
    public final void run() {
        try {
            Object object0 = this.b.call();
            this.a.set(object0);
        }
        catch(Exception unused_ex) {
        }
        this.c.lock();
        try {
            this.d.set(false);
            this.e.signal();
        }
        finally {
            this.c.unlock();
        }
    }
}

