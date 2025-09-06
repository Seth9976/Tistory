package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.observers.SerializedObserver;
import java.util.concurrent.atomic.AtomicInteger;

public final class i3 extends k3 {
    public final AtomicInteger e;
    public volatile boolean f;

    public i3(SerializedObserver serializedObserver0, ObservableSource observableSource0) {
        super(serializedObserver0, observableSource0);
        this.e = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.operators.observable.k3
    public final void a() {
        this.f = true;
        if(this.e.getAndIncrement() == 0) {
            Object object0 = this.getAndSet(null);
            if(object0 != null) {
                this.a.onNext(object0);
            }
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.internal.operators.observable.k3
    public final void b() {
        if(this.e.getAndIncrement() == 0) {
            while(true) {
                boolean z = this.f;
                Object object0 = this.getAndSet(null);
                if(object0 != null) {
                    this.a.onNext(object0);
                }
                if(z) {
                    this.a.onComplete();
                    return;
                }
                if(this.e.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }
}

