package gd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class s extends AtomicLong implements FlowableSubscriber, SingleObserver, Subscription {
    public final Subscriber a;
    public final Function b;
    public final AtomicReference c;
    public Disposable d;

    public s(Subscriber subscriber0, Function function0) {
        this.a = subscriber0;
        this.b = function0;
        this.c = new AtomicReference();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.d.dispose();
        SubscriptionHelper.cancel(this.c);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.SingleObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        this.d = disposable0;
        this.a.onSubscribe(this);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this.c, this, subscription0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Publisher publisher0;
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "the mapper returned a null Publisher");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.a.onError(throwable0);
            return;
        }
        publisher0.subscribe(this);
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this.c, this, v);
    }
}

