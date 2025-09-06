package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

public final class p extends BasicIntQueueSubscription implements SingleObserver {
    public final Subscriber a;
    public final Function b;
    public final AtomicLong c;
    public Disposable d;
    public volatile Iterator e;
    public volatile boolean f;
    public boolean g;

    public p(Subscriber subscriber0, Function function0) {
        this.a = subscriber0;
        this.b = function0;
        this.c = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.f = true;
        this.d.dispose();
        this.d = DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.e = null;
    }

    public final void drain() {
        Object object2;
        Object object0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        Subscriber subscriber0 = this.a;
        Iterator iterator0 = this.e;
        if(this.g && iterator0 != null) {
            subscriber0.onNext(null);
            subscriber0.onComplete();
            return;
        }
        int v = 1;
        while(true) {
            if(iterator0 != null) {
                long v1 = this.c.get();
                if(v1 == 0x7FFFFFFFFFFFFFFFL) {
                    while(!this.f) {
                        try {
                            object0 = iterator0.next();
                        }
                        catch(Throwable throwable0) {
                            Exceptions.throwIfFatal(throwable0);
                            subscriber0.onError(throwable0);
                            return;
                        }
                        subscriber0.onNext(object0);
                        if(this.f) {
                            break;
                        }
                        try {
                            if(!iterator0.hasNext()) {
                                goto label_27;
                            }
                            goto label_29;
                        }
                        catch(Throwable throwable1) {
                            Exceptions.throwIfFatal(throwable1);
                            subscriber0.onError(throwable1);
                            return;
                        }
                    label_27:
                        subscriber0.onComplete();
                        return;
                    label_29:
                        if(false) {
                            break;
                        }
                    }
                    return;
                }
                long v2 = 0L;
                while(v2 != v1) {
                    if(this.f) {
                        return;
                    }
                    try {
                        Object object1 = iterator0.next();
                        object2 = ObjectHelper.requireNonNull(object1, "The iterator returned a null value");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        subscriber0.onError(throwable2);
                        return;
                    }
                    subscriber0.onNext(object2);
                    if(this.f) {
                        return;
                    }
                    try {
                        ++v2;
                        if(!iterator0.hasNext()) {
                            goto label_52;
                        }
                        goto label_54;
                    }
                    catch(Throwable throwable3) {
                        Exceptions.throwIfFatal(throwable3);
                        subscriber0.onError(throwable3);
                        return;
                    }
                label_52:
                    subscriber0.onComplete();
                    return;
                label_54:
                    if(false) {
                        break;
                    }
                }
                if(v2 != 0L) {
                    BackpressureHelper.produced(this.c, v2);
                }
            }
            v = this.addAndGet(-v);
            if(v == 0) {
                return;
            }
            if(iterator0 == null) {
                iterator0 = this.e;
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.e == null;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        this.d = DisposableHelper.DISPOSED;
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Iterator iterator0;
        try {
            iterator0 = ((Iterable)this.b.apply(object0)).iterator();
            if(!iterator0.hasNext()) {
                goto label_7;
            }
            goto label_9;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.a.onError(throwable0);
            return;
        }
    label_7:
        this.a.onComplete();
        return;
    label_9:
        this.e = iterator0;
        this.drain();
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Iterator iterator0 = this.e;
        if(iterator0 != null) {
            Object object0 = iterator0.next();
            Object object1 = ObjectHelper.requireNonNull(object0, "The iterator returned a null value");
            if(!iterator0.hasNext()) {
                this.e = null;
            }
            return object1;
        }
        return null;
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this.c, v);
            this.drain();
        }
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int v) {
        if((v & 2) != 0) {
            this.g = true;
            return 2;
        }
        return 0;
    }
}

