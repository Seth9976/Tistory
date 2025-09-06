package io.reactivex.internal.operators.observable;

public final class p0 implements Runnable {
    public final Throwable a;
    public final q0 b;

    public p0(q0 q00, Throwable throwable0) {
        this.b = q00;
        this.a = throwable0;
    }

    @Override
    public final void run() {
        try {
            this.b.a.onError(this.a);
        }
        finally {
            this.b.d.dispose();
        }
    }
}

