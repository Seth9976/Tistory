package io.reactivex.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

public class TestObserver extends BaseTestConsumer implements CompletableObserver, MaybeObserver, Observer, SingleObserver, Disposable {
    public final Observer a;
    public final AtomicReference b;
    public QueueDisposable c;

    public TestObserver() {
        this(g.a);
    }

    public TestObserver(Observer observer0) {
        this.b = new AtomicReference();
        this.a = observer0;
    }

    @Override  // io.reactivex.observers.BaseTestConsumer
    public BaseTestConsumer assertNotSubscribed() {
        return this.assertNotSubscribed();
    }

    public final TestObserver assertNotSubscribed() {
        if(this.b.get() != null) {
            throw this.fail("Subscribed!");
        }
        if(!this.errors.isEmpty()) {
            throw this.fail("Not subscribed but errors found");
        }
        return this;
    }

    public final TestObserver assertOf(Consumer consumer0) {
        try {
            consumer0.accept(this);
            return this;
        }
        catch(Throwable throwable0) {
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
    }

    @Override  // io.reactivex.observers.BaseTestConsumer
    public BaseTestConsumer assertSubscribed() {
        return this.assertSubscribed();
    }

    public final TestObserver assertSubscribed() {
        if(this.b.get() == null) {
            throw this.fail("Not subscribed!");
        }
        return this;
    }

    public final void cancel() {
        this.dispose();
    }

    public static TestObserver create() {
        return new TestObserver();
    }

    public static TestObserver create(Observer observer0) {
        return new TestObserver(observer0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.b);
    }

    public final boolean hasSubscription() {
        return this.b.get() != null;
    }

    public final boolean isCancelled() {
        return this.isDisposed();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.b.get()));
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.CompletableObserver
    public void onComplete() {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.b.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.errors.add(illegalStateException0);
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            ++this.completions;
            this.a.onComplete();
        }
        finally {
            this.done.countDown();
        }
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.SingleObserver, io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.b.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.errors.add(illegalStateException0);
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if(throwable0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("onError received a null Throwable");
                this.errors.add(nullPointerException0);
            }
            else {
                this.errors.add(throwable0);
            }
            this.a.onError(throwable0);
        }
        finally {
            this.done.countDown();
        }
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        if(!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if(this.b.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.errors.add(illegalStateException0);
            }
        }
        this.lastThread = Thread.currentThread();
        if(this.establishedFusionMode == 2) {
            while(true) {
                try {
                    Object object1 = this.c.poll();
                    if(object1 == null) {
                        break;
                    }
                    this.values.add(object1);
                }
                catch(Throwable throwable0) {
                    this.errors.add(throwable0);
                    this.c.dispose();
                    break;
                }
            }
            return;
        }
        this.values.add(object0);
        if(object0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onNext received a null value");
            this.errors.add(nullPointerException0);
        }
        this.a.onNext(object0);
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.SingleObserver, io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        this.lastThread = Thread.currentThread();
        if(disposable0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onSubscribe received a null Subscription");
            this.errors.add(nullPointerException0);
            return;
        }
        AtomicReference atomicReference0 = this.b;
        do {
            if(atomicReference0.compareAndSet(null, disposable0)) {
                int v = this.initialFusionMode;
                if(v != 0 && disposable0 instanceof QueueDisposable) {
                    this.c = (QueueDisposable)disposable0;
                    int v1 = ((QueueDisposable)disposable0).requestFusion(v);
                    this.establishedFusionMode = v1;
                    if(v1 == 1) {
                        this.checkSubscriptionOnce = true;
                        this.lastThread = Thread.currentThread();
                        try {
                            Object object0;
                            while((object0 = this.c.poll()) != null) {
                                this.values.add(object0);
                            }
                            ++this.completions;
                            atomicReference0.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                        catch(Throwable throwable0) {
                        }
                        this.errors.add(throwable0);
                        return;
                    }
                }
                this.a.onSubscribe(disposable0);
                return;
            }
        }
        while(atomicReference0.get() == null);
        disposable0.dispose();
        if(atomicReference0.get() != DisposableHelper.DISPOSED) {
            IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable0);
            this.errors.add(illegalStateException0);
        }
    }

    @Override  // io.reactivex.MaybeObserver, io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
        this.onNext(object0);
        this.onComplete();
    }
}

