package io.reactivex.internal.operators.observable;

public final class j3 extends k3 {
    @Override  // io.reactivex.internal.operators.observable.k3
    public final void a() {
        this.a.onComplete();
    }

    @Override  // io.reactivex.internal.operators.observable.k3
    public final void b() {
        Object object0 = this.getAndSet(null);
        if(object0 != null) {
            this.a.onNext(object0);
        }
    }
}

