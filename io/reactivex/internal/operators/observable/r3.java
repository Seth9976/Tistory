package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

public final class r3 implements Observer {
    public final ArrayCompositeDisposable a;
    public final s3 b;
    public final SerializedObserver c;
    public Disposable d;

    public r3(ArrayCompositeDisposable arrayCompositeDisposable0, s3 s30, SerializedObserver serializedObserver0) {
        this.a = arrayCompositeDisposable0;
        this.b = s30;
        this.c = serializedObserver0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.b.d = true;
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.dispose();
        this.c.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        this.d.dispose();
        this.b.d = true;
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.d, disposable0)) {
            this.d = disposable0;
            this.a.setResource(1, disposable0);
        }
    }
}

