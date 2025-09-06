package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class h implements FlowableSubscriber, Disposable {
    public final CompletableObserver a;
    public final Function b;
    public final boolean c;
    public final AtomicThrowable d;
    public final AtomicReference e;
    public volatile boolean f;
    public Subscription g;
    public static final g h;

    static {
        h.h = new g(null);
    }

    public h(CompletableObserver completableObserver0, Function function0, boolean z) {
        this.a = completableObserver0;
        this.b = function0;
        this.c = z;
        this.d = new AtomicThrowable();
        this.e = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g.cancel();
        g g0 = (g)this.e.getAndSet(h.h);
        if(g0 != null && g0 != h.h) {
            DisposableHelper.dispose(g0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.get() == h.h;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f = true;
        if(this.e.get() == null) {
            Throwable throwable0 = this.d.terminate();
            if(throwable0 == null) {
                this.a.onComplete();
                return;
            }
            this.a.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.d;
        if(atomicThrowable0.addThrowable(throwable0)) {
            if(this.c) {
                this.onComplete();
                return;
            }
            g g0 = (g)this.e.getAndSet(h.h);
            if(g0 != null && g0 != h.h) {
                DisposableHelper.dispose(g0);
            }
            Throwable throwable1 = atomicThrowable0.terminate();
            if(throwable1 != ExceptionHelper.TERMINATED) {
                this.a.onError(throwable1);
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        CompletableSource completableSource0;
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.g.cancel();
            this.onError(throwable0);
            return;
        }
        g g0 = new g(this);
        while(true) {
            AtomicReference atomicReference0 = this.e;
            g g1 = (g)atomicReference0.get();
            if(g1 == h.h) {
                break;
            }
        label_11:
            if(atomicReference0.compareAndSet(g1, g0)) {
                if(g1 != null) {
                    DisposableHelper.dispose(g1);
                }
                completableSource0.subscribe(g0);
                return;
            }
            if(atomicReference0.get() != g1) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_11;
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.g, subscription0)) {
            this.g = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }
}

