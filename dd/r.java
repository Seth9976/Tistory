package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

public final class r extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final CompletableObserver a;
    public final int b;
    public final boolean c;
    public final AtomicThrowable d;
    public final CompositeDisposable e;
    public Subscription f;

    public r(CompletableObserver completableObserver0, int v, boolean z) {
        this.a = completableObserver0;
        this.b = v;
        this.c = z;
        this.e = new CompositeDisposable();
        this.d = new AtomicThrowable();
        this.lazySet(1);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f.cancel();
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.decrementAndGet() == 0) {
            AtomicThrowable atomicThrowable0 = this.d;
            Throwable throwable0 = (Throwable)atomicThrowable0.get();
            CompletableObserver completableObserver0 = this.a;
            if(throwable0 != null) {
                completableObserver0.onError(atomicThrowable0.terminate());
                return;
            }
            completableObserver0.onComplete();
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        CompletableObserver completableObserver0 = this.a;
        AtomicThrowable atomicThrowable0 = this.d;
        if(!this.c) {
            this.e.dispose();
            if(!atomicThrowable0.addThrowable(throwable0)) {
                RxJavaPlugins.onError(throwable0);
            }
            else if(this.getAndSet(0) > 0) {
                completableObserver0.onError(atomicThrowable0.terminate());
            }
        }
        else if(!atomicThrowable0.addThrowable(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
        else if(this.decrementAndGet() == 0) {
            completableObserver0.onError(atomicThrowable0.terminate());
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        this.getAndIncrement();
        q q0 = new q(this, 0);
        this.e.add(q0);
        ((CompletableSource)object0).subscribe(q0);
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.f, subscription0)) {
            this.f = subscription0;
            this.a.onSubscribe(this);
            int v = this.b;
            if(v == 0x7FFFFFFF) {
                subscription0.request(0x7FFFFFFFFFFFFFFFL);
                return;
            }
            subscription0.request(((long)v));
        }
    }
}

