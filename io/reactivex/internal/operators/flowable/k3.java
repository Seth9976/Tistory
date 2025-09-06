package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class k3 extends SubscriptionArbiter implements FlowableSubscriber {
    public final Subscriber h;
    public final Function i;
    public final boolean j;
    public boolean k;
    public boolean l;
    public long m;

    public k3(Subscriber subscriber0, Function function0, boolean z) {
        super(false);
        this.h = subscriber0;
        this.i = function0;
        this.j = z;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.l) {
            return;
        }
        this.l = true;
        this.k = true;
        this.h.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        long v;
        Publisher publisher0;
        Subscriber subscriber0 = this.h;
        if(this.k) {
            if(this.l) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            subscriber0.onError(throwable0);
            return;
        }
        this.k = true;
        if(this.j && !(throwable0 instanceof Exception)) {
            subscriber0.onError(throwable0);
            return;
        }
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.i.apply(throwable0), "The nextSupplier returned a null Publisher");
            v = this.m;
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            subscriber0.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
            return;
        }
        if(v != 0L) {
            this.produced(v);
        }
        publisher0.subscribe(this);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.l) {
            return;
        }
        if(!this.k) {
            ++this.m;
        }
        this.h.onNext(object0);
    }
}

