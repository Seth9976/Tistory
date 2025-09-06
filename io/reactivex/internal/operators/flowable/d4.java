package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d4 extends AtomicReference implements ReplayBuffer {
    public h4 a;
    public int b;
    public long c;

    public d4() {
        h4 h40 = new h4(null, 0L);
        this.a = h40;
        this.set(h40);
    }

    public Object a(Object object0) {
        return object0;
    }

    public h4 b() {
        return (h4)this.get();
    }

    public Object c(Object object0) {
        return object0;
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void complete() {
        long v = this.c + 1L;
        this.c = v;
        h4 h40 = new h4(this.a(NotificationLite.complete()), v);
        this.a.set(h40);
        this.a = h40;
        ++this.b;
        this.e();
    }

    public abstract void d();

    public void e() {
        h4 h40 = (h4)this.get();
        if(h40.a != null) {
            h4 h41 = new h4(null, 0L);
            h41.lazySet(h40.get());
            this.set(h41);
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void error(Throwable throwable0) {
        Object object0 = this.a(NotificationLite.error(throwable0));
        long v = this.c + 1L;
        this.c = v;
        h4 h40 = new h4(object0, v);
        this.a.set(h40);
        this.a = h40;
        ++this.b;
        this.e();
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void next(Object object0) {
        long v = this.c + 1L;
        this.c = v;
        h4 h40 = new h4(this.a(object0), v);
        this.a.set(h40);
        this.a = h40;
        ++this.b;
        this.d();
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void replay(f4 f40) {
        __monitor_enter(f40);
        if(f40.e) {
            f40.f = true;
            __monitor_exit(f40);
            return;
        }
        f40.e = true;
        __monitor_exit(f40);
        while(true) {
            if(f40.isDisposed()) {
                f40.c = null;
                return;
            }
            long v = f40.get();
            boolean z = Long.compare(v, 0x7FFFFFFFFFFFFFFFL) == 0;
            h4 h40 = (h4)f40.c;
            if(h40 == null) {
                h40 = this.b();
                f40.c = h40;
                BackpressureHelper.add(f40.d, h40.b);
            }
            long v1 = 0L;
            while(v != 0L) {
                h4 h41 = (h4)h40.get();
                if(h41 == null) {
                    break;
                }
                Object object0 = this.c(h41.a);
                try {
                    if(NotificationLite.accept(object0, f40.b)) {
                        f40.c = null;
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    f40.c = null;
                    f40.dispose();
                    if(!NotificationLite.isError(object0) && !NotificationLite.isComplete(object0)) {
                        f40.b.onError(throwable0);
                    }
                    return;
                }
                ++v1;
                --v;
                if(f40.isDisposed()) {
                    f40.c = null;
                    return;
                }
                h40 = h41;
            }
            if(v1 != 0L) {
                f40.c = h40;
                if(!z) {
                    BackpressureHelper.producedCancel(f40, v1);
                }
            }
            synchronized(f40) {
                if(!f40.f) {
                    f40.e = false;
                    return;
                }
                f40.f = false;
            }
        }
    }
}

