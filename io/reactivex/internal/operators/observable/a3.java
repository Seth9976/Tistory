package io.reactivex.internal.operators.observable;

public final class a3 extends q2 {
    public final int c;

    public a3(int v) {
        this.c = v;
    }

    @Override  // io.reactivex.internal.operators.observable.q2
    public final void d() {
        if(this.b > this.c) {
            t2 t20 = (t2)((t2)this.get()).get();
            --this.b;
            this.set(t20);
        }
    }
}

