package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class b extends AtomicReference implements CompletableObserver, FlowableSubscriber, Subscription {
    public final Subscriber a;
    public Publisher b;
    public Disposable c;
    public final AtomicLong d;

    public b(Publisher publisher0, Subscriber subscriber0) {
        this.a = subscriber0;
        this.b = publisher0;
        this.d = new AtomicLong();
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        this.c.dispose();
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public final void onComplete() {
        Publisher publisher0 = this.b;
        if(publisher0 == null) {
            this.a.onComplete();
            return;
        }
        this.b = null;
        publisher0.subscribe(this);
    }

    @Override  // io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.CompletableObserver
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

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        SubscriptionHelper.deferredRequest(this, this.d, v);
    }
}

