package ed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class r implements Observer, Disposable {
    public final CompletableObserver a;
    public final Function b;
    public final boolean c;
    public final AtomicThrowable d;
    public final AtomicReference e;
    public volatile boolean f;
    public Disposable g;
    public static final q h;

    static {
        r.h = new q(null);
    }

    public r(CompletableObserver completableObserver0, Function function0, boolean z) {
        this.a = completableObserver0;
        this.b = function0;
        this.c = z;
        this.d = new AtomicThrowable();
        this.e = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.g.dispose();
        q q0 = (q)this.e.getAndSet(r.h);
        if(q0 != null && q0 != r.h) {
            DisposableHelper.dispose(q0);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.get() == r.h;
    }

    @Override  // io.reactivex.Observer
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

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        AtomicThrowable atomicThrowable0 = this.d;
        if(atomicThrowable0.addThrowable(throwable0)) {
            if(this.c) {
                this.onComplete();
                return;
            }
            q q0 = (q)this.e.getAndSet(r.h);
            if(q0 != null && q0 != r.h) {
                DisposableHelper.dispose(q0);
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

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        CompletableSource completableSource0;
        try {
            completableSource0 = (CompletableSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null CompletableSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.g.dispose();
            this.onError(throwable0);
            return;
        }
        q q0 = new q(this);
        while(true) {
            AtomicReference atomicReference0 = this.e;
            q q1 = (q)atomicReference0.get();
            if(q1 == r.h) {
                break;
            }
        label_11:
            if(atomicReference0.compareAndSet(q1, q0)) {
                if(q1 != null) {
                    DisposableHelper.dispose(q1);
                }
                completableSource0.subscribe(q0);
                return;
            }
            if(atomicReference0.get() != q1) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_11;
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.g, disposable0)) {
            this.g = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

