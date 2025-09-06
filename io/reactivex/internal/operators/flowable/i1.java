package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;

public final class i1 extends BasicFuseableConditionalSubscriber {
    public final int a;
    public final Object b;

    public i1(ConditionalSubscriber conditionalSubscriber0, Object object0, int v) {
        this.a = v;
        super(conditionalSubscriber0);
        this.b = object0;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Object object1;
        switch(this.a) {
            case 0: {
                this.downstream.onNext(object0);
                if(this.sourceMode == 0) {
                    try {
                        ((Consumer)this.b).accept(object0);
                        return;
                    }
                    catch(Throwable throwable1) {
                        this.fail(throwable1);
                    }
                }
                return;
            }
            case 1: {
                if(!this.tryOnNext(object0)) {
                    this.upstream.request(1L);
                }
                return;
            }
            default: {
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
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        switch(this.a) {
            case 0: {
                goto label_3;
            }
            case 1: {
                goto label_7;
            }
        }
        Object object0 = this.qs.poll();
        return object0 == null ? null : ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
    label_3:
        Object object1 = this.qs.poll();
        if(object1 != null) {
            ((Consumer)this.b).accept(object1);
        }
        return object1;
    label_7:
        QueueSubscription queueSubscription0 = this.qs;
        while(true) {
            Object object2 = queueSubscription0.poll();
            if(object2 == null) {
                return null;
            }
            if(((Predicate)this.b).test(object2)) {
                return object2;
            }
            if(this.sourceMode == 2) {
                queueSubscription0.request(1L);
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        switch(this.a) {
            case 0: {
                boolean z = this.downstream.tryOnNext(object0);
                try {
                    ((Consumer)this.b).accept(object0);
                }
                catch(Throwable throwable1) {
                    this.fail(throwable1);
                }
                return z;
            }
            case 1: {
                if(!this.done) {
                    if(this.sourceMode != 0) {
                        return this.downstream.tryOnNext(null);
                    }
                    try {
                        return ((Predicate)this.b).test(object0) && this.downstream.tryOnNext(object0);
                    }
                    catch(Throwable throwable2) {
                        this.fail(throwable2);
                        return true;
                    }
                }
                return false;
            }
            default: {
                if(this.done) {
                    return false;
                }
                try {
                    Object object1 = ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
                    return this.downstream.tryOnNext(object1);
                }
                catch(Throwable throwable0) {
                    this.fail(throwable0);
                    return true;
                }
            }
        }
    }
}

