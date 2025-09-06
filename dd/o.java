package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

public final class o implements FlowableSubscriber, Disposable {
    public final int a;
    public final CompletableObserver b;
    public Subscription c;

    public o(CompletableObserver completableObserver0, int v) {
        this.a = v;
        this.b = completableObserver0;
        super();
    }

    private final void a(Object object0) {
    }

    private final void b(Object object0) {
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            this.c.cancel();
            this.c = SubscriptionHelper.CANCELLED;
            return;
        }
        this.c.cancel();
        this.c = SubscriptionHelper.CANCELLED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.a != 0) {
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onComplete();
            return;
        }
        this.b.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.c = SubscriptionHelper.CANCELLED;
            this.b.onError(throwable0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(this.a != 0) {
            if(SubscriptionHelper.validate(this.c, subscription0)) {
                this.c = subscription0;
                this.b.onSubscribe(this);
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
            }
            return;
        }
        if(SubscriptionHelper.validate(this.c, subscription0)) {
            this.c = subscription0;
            this.b.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

