package io.reactivex.internal.operators.observable;

public final class s4 implements Runnable {
    public final long a;
    public final t4 b;

    public s4(long v, t4 t40) {
        this.a = v;
        this.b = t40;
    }

    @Override
    public final void run() {
        t4 t40 = this.b;
        if(t4.M(t40)) {
            t40.n = true;
        }
        else {
            t4.N(t40).offer(this);
        }
        if(t40.enter()) {
            t40.O();
        }
    }
}

