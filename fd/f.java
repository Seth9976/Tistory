package fd;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class f implements ConditionalSubscriber, Subscription {
    public final Predicate a;
    public final BiFunction b;
    public Subscription c;
    public boolean d;
    public final int e;
    public final Subscriber f;

    public f(Subscriber subscriber0, Predicate predicate0, BiFunction biFunction0, int v) {
        this.e = v;
        super();
        this.a = predicate0;
        this.b = biFunction0;
        this.f = subscriber0;
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.cancel();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.e != 0) {
            if(!this.d) {
                this.d = true;
                this.f.onComplete();
            }
            return;
        }
        if(!this.d) {
            this.d = true;
            ((ConditionalSubscriber)this.f).onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e != 0) {
            if(this.d) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.d = true;
            this.f.onError(throwable0);
            return;
        }
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        ((ConditionalSubscriber)this.f).onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(!this.tryOnNext(object0) && !this.d) {
            this.c.request(1L);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.e != 0) {
            if(SubscriptionHelper.validate(this.c, subscription0)) {
                this.c = subscription0;
                this.f.onSubscribe(this);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            ((ConditionalSubscriber)this.f).onSubscribe(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        this.c.request(v);
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.e != 0) {
            if(!this.d) {
                long v = 0L;
                try {
                label_3:
                    if(this.a.test(object0)) {
                        goto label_22;
                    }
                    return false;
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    try {
                        ++v;
                        ParallelFailureHandling parallelFailureHandling0 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.b.apply(v, throwable0), "The errorHandler returned a null item");
                    }
                    catch(Throwable throwable1) {
                        Exceptions.throwIfFatal(throwable1);
                        this.cancel();
                        this.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                        return false;
                    }
                    switch(e.a[parallelFailureHandling0.ordinal()]) {
                        case 1: {
                            goto label_3;
                        }
                        case 2: {
                            return false;
                        }
                        case 3: {
                            this.cancel();
                            this.onComplete();
                            return false;
                        }
                        default: {
                            this.cancel();
                            this.onError(throwable0);
                            return false;
                        }
                    }
                }
            label_22:
                this.f.onNext(object0);
                return true;
            }
            return false;
        }
        if(!this.d) {
            long v1 = 0L;
            try {
                return this.a.test(object0) && ((ConditionalSubscriber)this.f).tryOnNext(object0);
            }
            catch(Throwable throwable2) {
                Exceptions.throwIfFatal(throwable2);
                try {
                    ++v1;
                    ParallelFailureHandling parallelFailureHandling1 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.b.apply(v1, throwable2), "The errorHandler returned a null item");
                }
                catch(Throwable throwable3) {
                    Exceptions.throwIfFatal(throwable3);
                    this.cancel();
                    this.onError(new CompositeException(new Throwable[]{throwable2, throwable3}));
                    return false;
                }
                switch(e.a[parallelFailureHandling1.ordinal()]) {
                    case 1: {
                        return this.a.test(object0) && ((ConditionalSubscriber)this.f).tryOnNext(object0);
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        this.cancel();
                        this.onComplete();
                        return false;
                    }
                    default: {
                        this.cancel();
                        this.onError(throwable2);
                        return false;
                    }
                }
            }
        }
        return false;
    }
}

