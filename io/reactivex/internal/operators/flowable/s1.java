package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

public final class s1 extends BasicFuseableSubscriber implements ConditionalSubscriber {
    public final Predicate a;

    public s1(Subscriber subscriber0, Predicate predicate0) {
        super(subscriber0);
        this.a = predicate0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0)) {
            this.upstream.request(1L);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        QueueSubscription queueSubscription0 = this.qs;
        while(true) {
            Object object0 = queueSubscription0.poll();
            if(object0 == null) {
                return null;
            }
            if(this.a.test(object0)) {
                return object0;
            }
            if(this.sourceMode == 2) {
                queueSubscription0.request(1L);
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        boolean z;
        if(this.done) {
            return false;
        }
        if(this.sourceMode != 0) {
            this.downstream.onNext(null);
            return true;
        }
        try {
            z = this.a.test(object0);
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return true;
        }
        if(z) {
            this.downstream.onNext(object0);
        }
        return z;
    }
}

