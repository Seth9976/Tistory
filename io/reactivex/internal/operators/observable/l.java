package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l extends AtomicBoolean implements Observer, Disposable {
    public final Observer a;
    public final int b;
    public final int c;
    public final Callable d;
    public Disposable e;
    public final ArrayDeque f;
    public long g;

    public l(Observer observer0, int v, int v1, Callable callable0) {
        this.a = observer0;
        this.b = v;
        this.c = v1;
        this.d = callable0;
        this.f = new ArrayDeque();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Observer observer0;
        while(true) {
            ArrayDeque arrayDeque0 = this.f;
            observer0 = this.a;
            if(arrayDeque0.isEmpty()) {
                break;
            }
            observer0.onNext(arrayDeque0.poll());
        }
        observer0.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.f.clear();
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Collection collection0;
        long v = this.g;
        this.g = v + 1L;
        Observer observer0 = this.a;
        ArrayDeque arrayDeque0 = this.f;
        if(Long.compare(v % ((long)this.c), 0L) == 0) {
            try {
                collection0 = (Collection)ObjectHelper.requireNonNull(this.d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            }
            catch(Throwable throwable0) {
                arrayDeque0.clear();
                this.e.dispose();
                observer0.onError(throwable0);
                return;
            }
            arrayDeque0.offer(collection0);
        }
        Iterator iterator0 = arrayDeque0.iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            Collection collection1 = (Collection)object1;
            collection1.add(object0);
            if(this.b <= collection1.size()) {
                iterator0.remove();
                observer0.onNext(collection1);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.e, disposable0)) {
            this.e = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

