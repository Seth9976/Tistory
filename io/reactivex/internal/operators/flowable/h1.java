package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

public final class h1 extends BasicFuseableSubscriber implements ConditionalSubscriber {
    public final Function a;
    public final BiPredicate b;
    public Object c;
    public boolean d;

    public h1(Subscriber subscriber0, Function function0, BiPredicate biPredicate0) {
        super(subscriber0);
        this.a = function0;
        this.b = biPredicate0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0)) {
            this.upstream.request(1L);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        while(true) {
            Object object0 = this.qs.poll();
            if(object0 == null) {
                return null;
            }
            Object object1 = this.a.apply(object0);
            if(!this.d) {
                this.d = true;
                this.c = object1;
                return object0;
            }
            if(!this.b.test(this.c, object1)) {
                this.c = object1;
                return object0;
            }
            this.c = object1;
            if(this.sourceMode != 1) {
                this.upstream.request(1L);
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.done) {
            return false;
        }
        if(this.sourceMode != 0) {
            this.downstream.onNext(object0);
            return true;
        }
        try {
            Object object1 = this.a.apply(object0);
            if(this.d) {
                boolean z = this.b.test(this.c, object1);
                this.c = object1;
                if(z) {
                    return false;
                }
            }
            else {
                this.d = true;
                this.c = object1;
            }
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return true;
        }
        this.downstream.onNext(object0);
        return true;
    }
}

