package fd;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class c implements ConditionalSubscriber, Subscription {
    public final int a;
    public final Object b;
    public final BiFunction c;
    public Subscription d;
    public boolean e;
    public final Subscriber f;

    public c(int v, BiFunction biFunction0, Object object0, Subscriber subscriber0) {
        this.a = v;
        this.f = subscriber0;
        this.b = object0;
        this.c = biFunction0;
        super();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        switch(this.a) {
            case 0: {
                this.d.cancel();
                return;
            }
            case 1: {
                this.d.cancel();
                return;
            }
            case 2: {
                this.d.cancel();
                return;
            }
            default: {
                this.d.cancel();
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    this.e = true;
                    ((ConditionalSubscriber)this.f).onComplete();
                }
                return;
            }
            case 1: {
                if(!this.e) {
                    this.e = true;
                    this.f.onComplete();
                }
                return;
            }
            case 2: {
                if(!this.e) {
                    this.e = true;
                    ((ConditionalSubscriber)this.f).onComplete();
                }
                return;
            }
            default: {
                if(!this.e) {
                    this.e = true;
                    this.f.onComplete();
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                ((ConditionalSubscriber)this.f).onError(throwable0);
                return;
            }
            case 1: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.f.onError(throwable0);
                return;
            }
            case 2: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                ((ConditionalSubscriber)this.f).onError(throwable0);
                return;
            }
            default: {
                if(this.e) {
                    RxJavaPlugins.onError(throwable0);
                    return;
                }
                this.e = true;
                this.f.onError(throwable0);
            }
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                if(!this.tryOnNext(object0) && !this.e) {
                    this.d.request(1L);
                }
                return;
            }
            case 1: {
                if(!this.tryOnNext(object0)) {
                    this.d.request(1L);
                }
                return;
            }
            case 2: {
                if(!this.tryOnNext(object0) && !this.e) {
                    this.d.request(1L);
                }
                return;
            }
            default: {
                if(!this.tryOnNext(object0) && !this.e) {
                    this.d.request(1L);
                }
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        switch(this.a) {
            case 0: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    ((ConditionalSubscriber)this.f).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    this.f.onSubscribe(this);
                }
                return;
            }
            case 2: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    ((ConditionalSubscriber)this.f).onSubscribe(this);
                }
                return;
            }
            default: {
                if(SubscriptionHelper.validate(this.d, subscription0)) {
                    this.d = subscription0;
                    this.f.onSubscribe(this);
                }
            }
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        switch(this.a) {
            case 0: {
                this.d.request(v);
                return;
            }
            case 1: {
                this.d.request(v);
                return;
            }
            case 2: {
                this.d.request(v);
                return;
            }
            default: {
                this.d.request(v);
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        Object object1;
        switch(this.a) {
            case 0: {
                if(!this.e) {
                    long v1 = 0L;
                    try {
                    label_27:
                        ((Consumer)this.b).accept(object0);
                        return ((ConditionalSubscriber)this.f).tryOnNext(object0);
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        try {
                            ++v1;
                            ParallelFailureHandling parallelFailureHandling1 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.c.apply(v1, throwable2), "The errorHandler returned a null item");
                        }
                        catch(Throwable throwable3) {
                            Exceptions.throwIfFatal(throwable3);
                            this.cancel();
                            this.onError(new CompositeException(new Throwable[]{throwable2, throwable3}));
                            return false;
                        }
                        switch(b.a[parallelFailureHandling1.ordinal()]) {
                            case 1: {
                                goto label_27;
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
            case 1: {
                if(!this.e) {
                    long v2 = 0L;
                    try {
                    label_49:
                        ((Consumer)this.b).accept(object0);
                    }
                    catch(Throwable throwable4) {
                        Exceptions.throwIfFatal(throwable4);
                        try {
                            ++v2;
                            ParallelFailureHandling parallelFailureHandling2 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.c.apply(v2, throwable4), "The errorHandler returned a null item");
                        }
                        catch(Throwable throwable5) {
                            Exceptions.throwIfFatal(throwable5);
                            this.cancel();
                            this.onError(new CompositeException(new Throwable[]{throwable4, throwable5}));
                            return false;
                        }
                        switch(b.a[parallelFailureHandling2.ordinal()]) {
                            case 1: {
                                goto label_49;
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
                                this.onError(throwable4);
                                return false;
                            }
                        }
                    }
                    this.f.onNext(object0);
                    return true;
                }
                return false;
            }
            case 2: {
                if(!this.e) {
                    long v3 = 0L;
                    try {
                    label_73:
                        Object object2 = ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper returned a null value");
                        return ((ConditionalSubscriber)this.f).tryOnNext(object2);
                    }
                    catch(Throwable throwable6) {
                        Exceptions.throwIfFatal(throwable6);
                        try {
                            ++v3;
                            ParallelFailureHandling parallelFailureHandling3 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.c.apply(v3, throwable6), "The errorHandler returned a null item");
                        }
                        catch(Throwable throwable7) {
                            Exceptions.throwIfFatal(throwable7);
                            this.cancel();
                            this.onError(new CompositeException(new Throwable[]{throwable6, throwable7}));
                            return false;
                        }
                        switch(m.a[parallelFailureHandling3.ordinal()]) {
                            case 1: {
                                goto label_73;
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
                                this.onError(throwable6);
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            default: {
                if(!this.e) {
                    long v = 0L;
                    try {
                    label_3:
                        object1 = ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper returned a null value");
                    }
                    catch(Throwable throwable0) {
                        Exceptions.throwIfFatal(throwable0);
                        try {
                            ++v;
                            ParallelFailureHandling parallelFailureHandling0 = (ParallelFailureHandling)ObjectHelper.requireNonNull(this.c.apply(v, throwable0), "The errorHandler returned a null item");
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            this.cancel();
                            this.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
                            return false;
                        }
                        switch(m.a[parallelFailureHandling0.ordinal()]) {
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
                    this.f.onNext(object1);
                    return true;
                }
                return false;
            }
        }
    }
}

