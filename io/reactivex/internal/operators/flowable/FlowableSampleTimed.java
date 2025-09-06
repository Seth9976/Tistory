package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;

public final class FlowableSampleTimed extends a {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final boolean e;

    public FlowableSampleTimed(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, boolean z) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = z;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        SerializedSubscriber serializedSubscriber0 = new SerializedSubscriber(subscriber0);
        if(this.e) {
            v4 v40 = new v4(serializedSubscriber0, this.b, this.c, this.d);
            this.source.subscribe(v40);
            return;
        }
        w4 w40 = new w4(serializedSubscriber0, this.b, this.c, this.d);  // 初始化器: Lio/reactivex/internal/operators/flowable/x4;-><init>(Lio/reactivex/subscribers/SerializedSubscriber;JLjava/util/concurrent/TimeUnit;Lio/reactivex/Scheduler;)V
        this.source.subscribe(w40);
    }
}

