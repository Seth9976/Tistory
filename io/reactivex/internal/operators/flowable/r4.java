package io.reactivex.internal.operators.flowable;

import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

public final class r4 extends t4 {
    public final AtomicInteger f;
    public volatile boolean g;

    public r4(SerializedSubscriber serializedSubscriber0, Publisher publisher0) {
        super(serializedSubscriber0, publisher0);
        this.f = new AtomicInteger();
    }

    @Override  // io.reactivex.internal.operators.flowable.t4
    public final void a() {
        this.g = true;
        if(this.f.getAndIncrement() == 0) {
            this.b();
            this.a.onComplete();
        }
    }

    @Override  // io.reactivex.internal.operators.flowable.t4
    public final void c() {
        if(this.f.getAndIncrement() == 0) {
            while(true) {
                boolean z = this.g;
                this.b();
                if(z) {
                    this.a.onComplete();
                    return;
                }
                if(this.f.decrementAndGet() == 0) {
                    break;
                }
            }
        }
    }
}

