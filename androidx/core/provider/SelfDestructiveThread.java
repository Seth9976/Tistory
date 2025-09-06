package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import g.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class SelfDestructiveThread {
    public interface ReplyCallback {
        void onReply(Object arg1);
    }

    public final Object a;
    public HandlerThread b;
    public Handler c;
    public int d;
    public final r e;
    public final int f;
    public final int g;
    public final String h;

    public SelfDestructiveThread(String s, int v, int v1) {
        this.a = new Object();
        this.e = new r(this);
        this.h = s;
        this.g = v;
        this.f = v1;
        this.d = 0;
    }

    public final void a(Runnable runnable0) {
        synchronized(this.a) {
            if(this.b == null) {
                HandlerThread handlerThread0 = new HandlerThread(this.h, this.g);
                this.b = handlerThread0;
                handlerThread0.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                ++this.d;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable0));
        }
    }

    @VisibleForTesting
    public int getGeneration() {
        synchronized(this.a) {
        }
        return this.d;
    }

    @VisibleForTesting
    public boolean isRunning() {
        synchronized(this.a) {
        }
        return this.b != null;
    }

    public void postAndReply(Callable callable0, ReplyCallback selfDestructiveThread$ReplyCallback0) {
        this.a(new t(callable0, a.q(), selfDestructiveThread$ReplyCallback0));
    }

    public Object postAndWait(Callable callable0, int v) throws InterruptedException {
        ReentrantLock reentrantLock0 = new ReentrantLock();
        Condition condition0 = reentrantLock0.newCondition();
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
        this.a(new u(atomicReference0, callable0, reentrantLock0, atomicBoolean0, condition0));
        reentrantLock0.lock();
        try {
            if(!atomicBoolean0.get()) {
                return atomicReference0.get();
            }
            long v2 = TimeUnit.MILLISECONDS.toNanos(((long)v));
            do {
                try {
                    v2 = condition0.awaitNanos(v2);
                }
                catch(InterruptedException unused_ex) {
                }
                if(!atomicBoolean0.get()) {
                    return atomicReference0.get();
                }
            }
            while(v2 > 0L);
        }
        finally {
            reentrantLock0.unlock();
        }
        throw new InterruptedException("timeout");
    }
}

