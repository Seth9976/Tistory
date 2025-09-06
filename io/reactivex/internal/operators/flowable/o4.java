package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import org.reactivestreams.Subscriber;

public final class o4 extends ArrayList implements ReplayBuffer {
    public volatile int a;

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void complete() {
        this.add(NotificationLite.complete());
        ++this.a;
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void error(Throwable throwable0) {
        this.add(NotificationLite.error(throwable0));
        ++this.a;
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowableReplay$ReplayBuffer
    public final void next(Object object0) {
        this.add(object0);
        ++this.a;
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
        Subscriber subscriber0 = f40.b;
        while(true) {
            if(f40.isDisposed()) {
                return;
            }
            int v = this.a;
            Integer integer0 = (Integer)f40.c;
            int v1 = integer0 == null ? 0 : ((int)integer0);
            long v2 = f40.get();
            long v3 = v2;
            long v4;
            for(v4 = 0L; v3 != 0L && v1 < v; ++v4) {
                Object object0 = this.get(v1);
                try {
                    if(NotificationLite.accept(object0, subscriber0)) {
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    f40.dispose();
                    if(!NotificationLite.isError(object0) && !NotificationLite.isComplete(object0)) {
                        subscriber0.onError(throwable0);
                    }
                    return;
                }
                if(f40.isDisposed()) {
                    return;
                }
                ++v1;
                --v3;
            }
            if(v4 != 0L) {
                f40.c = v1;
                if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                    BackpressureHelper.producedCancel(f40, v4);
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

