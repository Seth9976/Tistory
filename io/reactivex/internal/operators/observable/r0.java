package io.reactivex.internal.operators.observable;

import dd.n;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class r0 implements Observer {
    public final int a;
    public final Observer b;
    public final SequentialDisposable c;
    public boolean d;
    public final ObservableSource e;

    public r0(ObservableSource observableSource0, Observer observer0) {
        this.a = 1;
        super();
        this.b = observer0;
        this.e = observableSource0;
        this.d = true;
        this.c = new SequentialDisposable();
    }

    public r0(ObservableDelaySubscriptionOther observableDelaySubscriptionOther0, SequentialDisposable sequentialDisposable0, Observer observer0) {
        this.a = 0;
        super();
        this.e = observableDelaySubscriptionOther0;
        this.c = sequentialDisposable0;
        this.b = observer0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.a != 0) {
            if(this.d) {
                this.d = false;
                this.e.subscribe(this);
                return;
            }
            this.b.onComplete();
            return;
        }
        if(!this.d) {
            this.d = true;
            n n0 = new n(this, 1);
            ((ObservableDelaySubscriptionOther)this.e).a.subscribe(n0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.a != 0) {
            this.b.onError(throwable0);
            return;
        }
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.d = true;
        this.b.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.a != 0) {
            if(this.d) {
                this.d = false;
            }
            this.b.onNext(object0);
            return;
        }
        this.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(this.a != 0) {
            this.c.update(disposable0);
            return;
        }
        this.c.update(disposable0);
    }
}

