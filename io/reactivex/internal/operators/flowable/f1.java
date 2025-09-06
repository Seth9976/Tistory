package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import org.reactivestreams.Subscriber;

public final class f1 extends BasicFuseableSubscriber {
    public final Collection a;
    public final Function b;

    public f1(Subscriber subscriber0, Function function0, Collection collection0) {
        super(subscriber0);
        this.b = function0;
        this.a = collection0;
    }

    @Override  // io.reactivex.internal.subscribers.BasicFuseableSubscriber
    public final void clear() {
        this.a.clear();
        super.clear();
    }

    @Override  // io.reactivex.internal.subscribers.BasicFuseableSubscriber
    public final void onComplete() {
        if(!this.done) {
            this.done = true;
            this.a.clear();
            this.downstream.onComplete();
        }
    }

    @Override  // io.reactivex.internal.subscribers.BasicFuseableSubscriber
    public final void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.done = true;
        this.a.clear();
        this.downstream.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.done) {
            return;
        }
        if(this.sourceMode == 0) {
            try {
                Object object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The keySelector returned a null key");
                if(this.a.add(object1)) {
                    goto label_9;
                }
                goto label_11;
            }
            catch(Throwable throwable0) {
                this.fail(throwable0);
                return;
            }
        label_9:
            this.downstream.onNext(object0);
            return;
        label_11:
            this.upstream.request(1L);
            return;
        }
        this.downstream.onNext(null);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0;
        while((object0 = this.qs.poll()) != null) {
            Object object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The keySelector returned a null key");
            if(this.a.add(object1)) {
                break;
            }
            if(this.sourceMode == 2) {
                this.upstream.request(1L);
            }
        }
        return object0;
    }
}

