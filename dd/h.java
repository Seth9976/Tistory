package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class h extends AtomicInteger implements CompletableObserver {
    public final int a;
    public final CompletableObserver b;
    public final Object c;
    public final Disposable d;

    public h(CompletableObserver completableObserver0, Iterator iterator0) {
        this.a = 0;
        super();
        this.b = completableObserver0;
        this.c = iterator0;
        this.d = new SequentialDisposable();
    }

    public h(CompletableObserver completableObserver0, AtomicBoolean atomicBoolean0, CompositeDisposable compositeDisposable0, int v) {
        this.a = 1;
        super();
        this.b = completableObserver0;
        this.c = atomicBoolean0;
        this.d = compositeDisposable0;
        this.lazySet(v);
    }

    public void a() {
        CompletableSource completableSource0;
        CompletableObserver completableObserver0 = this.b;
        SequentialDisposable sequentialDisposable0 = (SequentialDisposable)this.d;
        if(sequentialDisposable0.isDisposed()) {
            return;
        }
        if(this.getAndIncrement() != 0) {
            return;
        }
        Iterator iterator0 = (Iterator)this.c;
        do {
            if(sequentialDisposable0.isDisposed()) {
                return;
            }
            try {
                if(!iterator0.hasNext()) {
                    goto label_15;
                }
                goto label_17;
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                completableObserver0.onError(throwable0);
                return;
            }
        label_15:
            completableObserver0.onComplete();
            return;
            try {
            label_17:
                Object object0 = iterator0.next();
                completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(object0, "The CompletableSource returned is null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                completableObserver0.onError(throwable1);
                return;
            }
            completableSource0.subscribe(this);
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        if(this.a != 0) {
            if(this.decrementAndGet() == 0 && ((AtomicBoolean)this.c).compareAndSet(false, true)) {
                this.b.onComplete();
            }
            return;
        }
        this.a();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            ((CompositeDisposable)this.d).dispose();
            if(((AtomicBoolean)this.c).compareAndSet(false, true)) {
                this.b.onError(throwable0);
                return;
            }
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            ((CompositeDisposable)this.d).add(disposable0);
            return;
        }
        ((SequentialDisposable)this.d).replace(disposable0);
    }
}

