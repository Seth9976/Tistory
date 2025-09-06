package io.reactivex.internal.operators.maybe;

import ed.d;
import gd.a0;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class g0 extends AtomicReference implements MaybeObserver, Disposable {
    public final int a;
    public final MaybeObserver b;
    public final MaybeSource c;
    public final AtomicReference d;
    public final AtomicReference e;

    public g0(MaybeObserver maybeObserver0, MaybeSource maybeSource0, int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = maybeObserver0;
            this.d = new d(this, 4);
            this.c = maybeSource0;
            this.e = maybeSource0 == null ? null : new m(maybeObserver0, 1);
            return;
        }
        super();
        this.b = maybeObserver0;
        this.d = new a0(this, 5);
        this.c = maybeSource0;
        this.e = maybeSource0 == null ? null : new m(maybeObserver0, 2);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(((a0)this.d));
            m m0 = (m)this.e;
            if(m0 != null) {
                DisposableHelper.dispose(m0);
            }
            return;
        }
        DisposableHelper.dispose(this);
        DisposableHelper.dispose(((d)this.d));
        m m1 = (m)this.e;
        if(m1 != null) {
            DisposableHelper.dispose(m1);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.get()));
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onComplete() {
        if(this.a != 0) {
            SubscriptionHelper.cancel(((a0)this.d));
            if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.b.onComplete();
            }
            return;
        }
        DisposableHelper.dispose(((d)this.d));
        if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
            this.b.onComplete();
        }
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            SubscriptionHelper.cancel(((a0)this.d));
            if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.b.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        DisposableHelper.dispose(((d)this.d));
        if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
            this.b.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.setOnce(this, disposable0);
            return;
        }
        DisposableHelper.setOnce(this, disposable0);
    }

    @Override  // io.reactivex.MaybeObserver
    public final void onSuccess(Object object0) {
        if(this.a != 0) {
            SubscriptionHelper.cancel(((a0)this.d));
            if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
                this.b.onSuccess(object0);
            }
            return;
        }
        DisposableHelper.dispose(((d)this.d));
        if(this.getAndSet(DisposableHelper.DISPOSED) != DisposableHelper.DISPOSED) {
            this.b.onSuccess(object0);
        }
    }
}

