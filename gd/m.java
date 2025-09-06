package gd;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements SingleObserver {
    public final int a;
    public final CompositeDisposable b;
    public final Object[] c;
    public final SingleObserver d;
    public final AtomicInteger e;

    public m(int v, CompositeDisposable compositeDisposable0, Object[] arr_object, SingleObserver singleObserver0, AtomicInteger atomicInteger0) {
        this.a = v;
        this.b = compositeDisposable0;
        this.c = arr_object;
        this.d = singleObserver0;
        this.e = atomicInteger0;
    }

    @Override  // io.reactivex.SingleObserver
    public final void onError(Throwable throwable0) {
        do {
            AtomicInteger atomicInteger0 = this.e;
            int v = atomicInteger0.get();
            if(v >= 2) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
        }
        while(!atomicInteger0.compareAndSet(v, 2));
        this.b.dispose();
        this.d.onError(throwable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSubscribe(Disposable disposable0) {
        this.b.add(disposable0);
    }

    @Override  // io.reactivex.SingleObserver
    public final void onSuccess(Object object0) {
        Object[] arr_object = this.c;
        arr_object[this.a] = object0;
        if(this.e.incrementAndGet() == 2) {
            Boolean boolean0 = Boolean.valueOf(ObjectHelper.equals(arr_object[0], arr_object[1]));
            this.d.onSuccess(boolean0);
        }
    }
}

