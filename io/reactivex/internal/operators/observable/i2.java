package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;

public final class i2 implements Observer {
    public final int a;
    public final Observer b;
    public final AtomicReference c;

    public i2(Observer observer0, AtomicReference atomicReference0, int v) {
        this.a = v;
        this.b = observer0;
        this.c = atomicReference0;
        super();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            this.b.onComplete();
            return;
        }
        ((PublishSubject)this.b).onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        ((PublishSubject)this.b).onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            this.b.onNext(object0);
            return;
        }
        ((PublishSubject)this.b).onNext(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            DisposableHelper.replace(this.c, disposable0);
            return;
        }
        DisposableHelper.setOnce(((j2)this.c), disposable0);
    }
}

