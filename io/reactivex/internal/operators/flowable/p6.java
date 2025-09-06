package io.reactivex.internal.operators.flowable;

public final class p6 implements Runnable {
    public final long a;
    public final q6 b;

    public p6(long v, q6 q60) {
        this.a = v;
        this.b = q60;
    }

    @Override
    public final void run() {
        q6 q60 = this.b;
        if(q6.d0(q60)) {
            q60.y = true;
        }
        else {
            q6.e0(q60).offer(this);
        }
        if(q60.enter()) {
            q60.g0();
        }
    }
}

