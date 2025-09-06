package ed;

import dd.e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscription;

public final class c extends AtomicInteger implements FlowableSubscriber, Disposable {
    public final CompletableObserver a;
    public final Function b;
    public final ErrorMode c;
    public final AtomicThrowable d;
    public final e e;
    public final int f;
    public final SpscArrayQueue g;
    public Subscription h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;

    public c(CompletableObserver completableObserver0, Function function0, ErrorMode errorMode0, int v) {
        this.a = completableObserver0;
        this.b = function0;
        this.c = errorMode0;
        this.f = v;
        this.d = new AtomicThrowable();
        this.e = new e(this, 2);
        this.g = new SpscArrayQueue(v);
    }

    public final void a() {
        CompletableSource completableSource0;
        if(this.getAndIncrement() != 0) {
            return;
        }
        do {
            if(this.k) {
                this.g.clear();
                return;
            }
            if(!this.i) {
                if(this.c == ErrorMode.BOUNDARY && this.d.get() != null) {
                    this.g.clear();
                    Throwable throwable0 = this.d.terminate();
                    this.a.onError(throwable0);
                    return;
                }
                boolean z = this.j;
                Object object0 = this.g.poll();
                if(z && object0 == null) {
                    Throwable throwable1 = this.d.terminate();
                    if(throwable1 != null) {
                        this.a.onError(throwable1);
                        return;
                    }
                    this.a.onComplete();
                    return;
                }
                if(object0 != null) {
                    int v = this.f - (this.f >> 1);
                    int v1 = this.l + 1;
                    if(v1 == v) {
                        this.l = 0;
                        this.h.request(((long)v));
                    }
                    else {
                        this.l = v1;
                    }
                    try {
                        completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null CompletableSource");
                    }
                    catch(Throwable throwable2) {
                        Exceptions.throwIfFatal(throwable2);
                        this.g.clear();
                        this.h.cancel();
                        this.d.addThrowable(throwable2);
                        Throwable throwable3 = this.d.terminate();
                        this.a.onError(throwable3);
                        return;
                    }
                    this.i = true;
                    completableSource0.subscribe(this.e);
                }
            }
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.k = true;
        this.h.cancel();
        this.e.getClass();
        DisposableHelper.dispose(this.e);
        if(this.getAndIncrement() == 0) {
            this.g.clear();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.k;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.j = true;
        this.a();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            if(this.c != ErrorMode.IMMEDIATE) {
                this.j = true;
                this.a();
                return;
            }
            this.e.getClass();
            DisposableHelper.dispose(this.e);
            Throwable throwable1 = this.d.terminate();
            if(throwable1 != ExceptionHelper.TERMINATED) {
                this.a.onError(throwable1);
            }
            if(this.getAndIncrement() == 0) {
                this.g.clear();
            }
        }
        else {
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.g.offer(object0)) {
            this.a();
            return;
        }
        this.h.cancel();
        this.onError(new MissingBackpressureException("Queue full?!"));
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.h, subscription0)) {
            this.h = subscription0;
            this.a.onSubscribe(this);
            subscription0.request(((long)this.f));
        }
    }
}

