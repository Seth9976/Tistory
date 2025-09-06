package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;

public final class x3 extends ArrayDeque implements Observer, Disposable {
    public final Observer a;
    public final int b;
    public Disposable c;
    public volatile boolean d;

    public x3(Observer observer0, int v) {
        this.a = observer0;
        this.b = v;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(!this.d) {
            this.d = true;
            this.c.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        Observer observer0 = this.a;
        while(true) {
            if(this.d) {
                return;
            }
            Object object0 = this.poll();
            if(object0 == null) {
                if(!this.d) {
                    observer0.onComplete();
                }
                return;
            }
            observer0.onNext(object0);
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.b == this.size()) {
            this.poll();
        }
        this.offer(object0);
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

