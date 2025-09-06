package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

public final class j1 extends BasicFuseableSubscriber {
    public final int a;
    public final Object b;

    public j1(Subscriber subscriber0, Object object0, int v) {
        this.a = v;
        super(subscriber0);
        this.b = object0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object1;
        if(this.a != 0) {
            if(!this.done) {
                if(this.sourceMode != 0) {
                    this.downstream.onNext(null);
                    return;
                }
                try {
                    object1 = ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
                }
                catch(Throwable throwable0) {
                    this.fail(throwable0);
                    return;
                }
                this.downstream.onNext(object1);
                return;
            }
            return;
        }
        if(!this.done) {
            this.downstream.onNext(object0);
            if(this.sourceMode == 0) {
                try {
                    ((Consumer)this.b).accept(object0);
                }
                catch(Throwable throwable1) {
                    this.fail(throwable1);
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if(this.a != 0) {
            Object object0 = this.qs.poll();
            return object0 == null ? null : ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
        }
        Object object1 = this.qs.poll();
        if(object1 != null) {
            ((Consumer)this.b).accept(object1);
        }
        return object1;
    }
}

