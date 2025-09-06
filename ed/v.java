package ed;

import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class v extends AtomicInteger implements Observer, Disposable {
    public final Observer a;
    public final Function b;
    public final boolean c;
    public final AtomicThrowable d;
    public final AtomicReference e;
    public Disposable f;
    public volatile boolean g;
    public volatile boolean h;
    public static final u i;

    static {
        v.i = new u(null);
    }

    public v(Observer observer0, Function function0, boolean z) {
        this.a = observer0;
        this.b = function0;
        this.c = z;
        this.d = new AtomicThrowable();
        this.e = new AtomicReference();
    }

    public final void a() {
        u u0 = (u)this.e.getAndSet(v.i);
        if(u0 != null && u0 != v.i) {
            DisposableHelper.dispose(u0);
        }
    }

    public final void b() {
        if(this.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = this.a;
        AtomicThrowable atomicThrowable0 = this.d;
        AtomicReference atomicReference0 = this.e;
        int v = 1;
        while(true) {
            if(this.h) {
                return;
            }
            if(atomicThrowable0.get() != null && !this.c) {
                observer0.onError(atomicThrowable0.terminate());
                return;
            }
            boolean z = this.g;
            u u0 = (u)atomicReference0.get();
            if(z && u0 == null) {
                Throwable throwable0 = atomicThrowable0.terminate();
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                observer0.onComplete();
                return;
            }
            if(u0 != null && u0.b != null) {
                while(!atomicReference0.compareAndSet(u0, null) && atomicReference0.get() == u0) {
                }
                observer0.onNext(u0.b);
            }
            else {
                v = this.addAndGet(-v);
                if(v == 0) {
                    break;
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.h = true;
        this.f.dispose();
        this.a();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.h;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.g = true;
        this.b();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d.addThrowable(throwable0)) {
            if(!this.c) {
                this.a();
            }
            this.g = true;
            this.b();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        SingleSource singleSource0;
        u u0 = v.i;
        AtomicReference atomicReference0 = this.e;
        u u1 = (u)atomicReference0.get();
        if(u1 != null) {
            DisposableHelper.dispose(u1);
        }
        try {
            singleSource0 = (SingleSource)ObjectHelper.requireNonNull(this.b.apply(object0), "The mapper returned a null SingleSource");
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.f.dispose();
            atomicReference0.getAndSet(u0);
            this.onError(throwable0);
            return;
        }
        u u2 = new u(this);
        u u3;
        while((u3 = (u)atomicReference0.get()) != u0) {
        label_16:
            if(atomicReference0.compareAndSet(u3, u2)) {
                singleSource0.subscribe(u2);
                return;
            }
            if(atomicReference0.get() != u3) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_16;
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.f, disposable0)) {
            this.f = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

