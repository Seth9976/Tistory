package io.reactivex.internal.operators.flowable;

public final class a1 implements Runnable {
    public final c1 a;

    public a1(c1 c10) {
        this.a = c10;
    }

    @Override
    public final void run() {
        try {
            this.a.a.onComplete();
        }
        finally {
            this.a.d.dispose();
        }
    }
}

