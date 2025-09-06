package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

public final class s3 implements Observer {
    public final SerializedObserver a;
    public final ArrayCompositeDisposable b;
    public Disposable c;
    public volatile boolean d;
    public boolean e;

    public s3(SerializedObserver serializedObserver0, ArrayCompositeDisposable arrayCompositeDisposable0) {
        this.a = serializedObserver0;
        this.b = arrayCompositeDisposable0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        this.b.dispose();
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.b.dispose();
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.e) {
            this.a.onNext(object0);
            return;
        }
        if(this.d) {
            this.e = true;
            this.a.onNext(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.b.setResource(0, disposable0);
        }
    }
}

