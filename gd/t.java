package gd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

public final class t implements FlowableSubscriber, Disposable {
    public final SingleObserver a;
    public Subscription b;
    public Object c;
    public boolean d;
    public volatile boolean e;

    public t(SingleObserver singleObserver0) {
        this.a = singleObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e = true;
        this.b.cancel();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.d) {
            return;
        }
        this.d = true;
        Object object0 = this.c;
        this.c = null;
        SingleObserver singleObserver0 = this.a;
        if(object0 == null) {
            singleObserver0.onError(new NoSuchElementException("The source Publisher is empty"));
            return;
        }
        singleObserver0.onSuccess(object0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.c = null;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.d) {
            return;
        }
        if(this.c != null) {
            this.b.cancel();
            this.d = true;
            this.c = null;
            IndexOutOfBoundsException indexOutOfBoundsException0 = new IndexOutOfBoundsException("Too many elements in the Publisher");
            this.a.onError(indexOutOfBoundsException0);
            return;
        }
        this.c = object0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.b, subscription0)) {
            this.b = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

