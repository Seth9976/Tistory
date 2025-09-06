package io.reactivex.internal.operators.flowable;

public final class b1 implements Runnable {
    public final Throwable a;
    public final c1 b;

    public b1(c1 c10, Throwable throwable0) {
        this.b = c10;
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

