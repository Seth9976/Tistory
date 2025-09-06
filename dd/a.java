package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements CompletableObserver {
    public final int a;
    public final CompletableObserver b;
    public final CompositeDisposable c;
    public final Serializable d;
    public Object e;

    public a(CompletableObserver completableObserver0, CompositeDisposable compositeDisposable0, AtomicThrowable atomicThrowable0, AtomicInteger atomicInteger0) {
        this.a = 1;
        super();
        this.b = completableObserver0;
        this.c = compositeDisposable0;
        this.d = atomicThrowable0;
        this.e = atomicInteger0;
    }

    public a(CompletableObserver completableObserver0, CompositeDisposable compositeDisposable0, AtomicBoolean atomicBoolean0) {
        this.a = 0;
        super();
        this.d = atomicBoolean0;
        this.c = compositeDisposable0;
        this.b = completableObserver0;
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.a != 0) {
            if(((AtomicInteger)this.e).decrementAndGet() == 0) {
                Throwable throwable0 = ((AtomicThrowable)this.d).terminate();
                CompletableObserver completableObserver0 = this.b;
                if(throwable0 == null) {
                    completableObserver0.onComplete();
                    return;
                }
                completableObserver0.onError(throwable0);
            }
            return;
        }
        if(((AtomicBoolean)this.d).compareAndSet(false, true)) {
            this.c.delete(((Disposable)this.e));
            this.c.dispose();
            this.b.onComplete();
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            AtomicThrowable atomicThrowable0 = (AtomicThrowable)this.d;
            if(!atomicThrowable0.addThrowable(throwable0)) {
                RxJavaPlugins.onError(throwable0);
            }
            else if(((AtomicInteger)this.e).decrementAndGet() == 0) {
                Throwable throwable1 = atomicThrowable0.terminate();
                CompletableObserver completableObserver0 = this.b;
                if(throwable1 == null) {
                    completableObserver0.onComplete();
                    return;
                }
                completableObserver0.onError(throwable1);
                return;
            }
            return;
        }
        if(((AtomicBoolean)this.d).compareAndSet(false, true)) {
            this.c.delete(((Disposable)this.e));
            this.c.dispose();
            this.b.onError(throwable0);
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            this.c.add(disposable0);
            return;
        }
        this.e = disposable0;
        this.c.add(disposable0);
    }
}

