package gd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class g extends AtomicReference implements FlowableSubscriber, Disposable {
    public final SingleObserver a;
    public final SingleSource b;
    public boolean c;
    public Subscription d;

    public g(SingleObserver singleObserver0, SingleSource singleSource0) {
        this.a = singleObserver0;
        this.b = singleSource0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.d.cancel();
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.c) {
            return;
        }
        this.c = true;
        ResumeSingleObserver resumeSingleObserver0 = new ResumeSingleObserver(this, this.a);
        this.b.subscribe(resumeSingleObserver0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.c) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.c = true;
        this.a.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.d.cancel();
        this.onComplete();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.d, subscription0)) {
            this.d = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

