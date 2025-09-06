package io.reactivex.internal.operators.flowable;

public final class u0 extends r0 {
    @Override  // io.reactivex.Emitter
    public final void onNext(Object object0) {
        if(this.b.isDisposed()) {
            return;
        }
        if(object0 != null) {
            this.a.onNext(object0);
            do {
                long v = this.get();
            }
            while(v != 0L && !this.compareAndSet(v, v - 1L));
            return;
        }
        this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
    }
}

