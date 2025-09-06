package io.reactivex.internal.operators.observable;

public final class g3 extends h3 {
    @Override  // io.reactivex.internal.operators.observable.h3
    public final void a() {
        this.a.onComplete();
    }

    @Override
    public final void run() {
        Object object0 = this.getAndSet(null);
        if(object0 != null) {
            this.a.onNext(object0);
        }
    }
}

