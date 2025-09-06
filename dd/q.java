package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.flowable.v1;
import io.reactivex.internal.operators.flowable.w1;
import io.reactivex.internal.operators.observable.e1;
import io.reactivex.internal.operators.observable.f1;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class q extends AtomicReference implements CompletableObserver, Disposable {
    public final int a;
    public final AtomicInteger b;

    public q(AtomicInteger atomicInteger0, int v) {
        this.a = v;
        this.b = atomicInteger0;
        super();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                DisposableHelper.dispose(this);
                return;
            }
            case 1: {
                DisposableHelper.dispose(this);
                return;
            }
            case 2: {
                DisposableHelper.dispose(this);
                return;
            }
            case 3: {
                DisposableHelper.dispose(this);
                return;
            }
            default: {
                DisposableHelper.dispose(this);
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 1: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 2: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            case 3: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
            default: {
                return DisposableHelper.isDisposed(((Disposable)this.get()));
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                r r0 = (r)this.b;
                r0.e.delete(this);
                if(r0.decrementAndGet() == 0) {
                    Throwable throwable0 = (Throwable)r0.d.get();
                    CompletableObserver completableObserver0 = r0.a;
                    if(throwable0 != null) {
                        completableObserver0.onError(throwable0);
                        return;
                    }
                    completableObserver0.onComplete();
                    return;
                }
                if(r0.b != 0x7FFFFFFF) {
                    r0.f.request(1L);
                }
                return;
            }
            case 1: {
                ((v1)this.b).e.delete(this);
                ((v1)this.b).onComplete();
                return;
            }
            case 2: {
                ((w1)this.b).e.delete(this);
                ((w1)this.b).onComplete();
                return;
            }
            case 3: {
                ((e1)this.b).e.delete(this);
                ((e1)this.b).onComplete();
                return;
            }
            default: {
                ((f1)this.b).e.delete(this);
                ((f1)this.b).onComplete();
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                r r0 = (r)this.b;
                CompositeDisposable compositeDisposable0 = r0.e;
                compositeDisposable0.delete(this);
                CompletableObserver completableObserver0 = r0.a;
                AtomicThrowable atomicThrowable0 = r0.d;
                if(!r0.c) {
                    r0.f.cancel();
                    compositeDisposable0.dispose();
                    if(!atomicThrowable0.addThrowable(throwable0)) {
                        RxJavaPlugins.onError(throwable0);
                        return;
                    }
                    else if(r0.getAndSet(0) > 0) {
                        completableObserver0.onError(atomicThrowable0.terminate());
                        return;
                    }
                }
                else if(atomicThrowable0.addThrowable(throwable0)) {
                    if(r0.decrementAndGet() == 0) {
                        completableObserver0.onError(atomicThrowable0.terminate());
                        return;
                    }
                    if(r0.b != 0x7FFFFFFF) {
                        r0.f.request(1L);
                        return;
                    }
                }
                else {
                    RxJavaPlugins.onError(throwable0);
                }
                return;
            }
            case 1: {
                ((v1)this.b).e.delete(this);
                ((v1)this.b).onError(throwable0);
                return;
            }
            case 2: {
                ((w1)this.b).e.delete(this);
                ((w1)this.b).onError(throwable0);
                return;
            }
            case 3: {
                ((e1)this.b).e.delete(this);
                ((e1)this.b).onError(throwable0);
                return;
            }
            default: {
                ((f1)this.b).e.delete(this);
                ((f1)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 1: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 2: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            case 3: {
                DisposableHelper.setOnce(this, disposable0);
                return;
            }
            default: {
                DisposableHelper.setOnce(this, disposable0);
            }
        }
    }
}

