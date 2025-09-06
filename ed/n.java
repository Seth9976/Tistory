package ed;

import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class n extends AtomicReference implements FlowableSubscriber, MaybeObserver, Subscription {
    public final Subscriber a;
    public final Function b;
    public Disposable c;
    public final AtomicLong d;

    public n(Subscriber subscriber0, Function function0) {
        this.a = subscriber0;
        this.b = function0;
        this.d = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.dispose();
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.MaybeObserver, org.reactivestreams.Subscriber
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.MaybeObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.deferredSetOnce(this, this.d, subscription0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        Publisher publisher0;
        try {
            publisher0 = (Publisher)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null Publisher");
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
        SubscriptionHelper.deferredRequest(this, this.d, v);
    }
}

