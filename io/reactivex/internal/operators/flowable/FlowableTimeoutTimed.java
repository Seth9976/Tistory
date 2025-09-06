package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableTimeoutTimed extends a {
    interface TimeoutSupport {
        void onTimeout(long arg1);
    }

    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final Publisher e;

    public FlowableTimeoutTimed(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, Publisher publisher0) {
        super(flowable0);
        this.b = v;
        this.c = timeUnit0;
        this.d = scheduler0;
        this.e = publisher0;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        Scheduler scheduler0 = this.d;
        if(this.e == null) {
            Worker scheduler$Worker0 = scheduler0.createWorker();
            b6 b60 = new b6(subscriber0, this.b, this.c, scheduler$Worker0);
            subscriber0.onSubscribe(b60);
            c6 c60 = new c6(0L, b60);
            Disposable disposable0 = b60.d.schedule(c60, b60.b, b60.c);
            b60.e.replace(disposable0);
            this.source.subscribe(b60);
            return;
        }
        Worker scheduler$Worker1 = scheduler0.createWorker();
        a6 a60 = new a6(subscriber0, this.b, this.c, scheduler$Worker1, this.e);
        subscriber0.onSubscribe(a60);
        c6 c61 = new c6(0L, a60);
        Disposable disposable1 = a60.k.schedule(c61, a60.i, a60.j);
        a60.l.replace(disposable1);
        this.source.subscribe(a60);
    }
}

