package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;

public final class c3 extends ArrayList implements ReplayBuffer {
    public volatile int a;

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void complete() {
        this.add(NotificationLite.complete());
        ++this.a;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void error(Throwable throwable0) {
        this.add(NotificationLite.error(throwable0));
        ++this.a;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void next(Object object0) {
        this.add(object0);
        ++this.a;
    }

    @Override  // io.reactivex.internal.operators.observable.ObservableReplay$ReplayBuffer
    public final void replay(r2 r20) {
        if(r20.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = r20.b;
        int v = 1;
        do {
            if(r20.d) {
                return;
            }
            int v1 = this.a;
            Integer integer0 = (Integer)r20.c;
            int v2;
            for(v2 = integer0 == null ? 0 : ((int)integer0); v2 < v1; ++v2) {
                if(NotificationLite.accept(this.get(v2), observer0)) {
                    return;
                }
                if(r20.d) {
                    return;
                }
            }
            r20.c = v2;
            v = r20.addAndGet(-v);
        }
        while(v != 0);
    }
}

