package io.reactivex.internal.operators.observable;

public final class o0 implements Runnable {
    public final q0 a;

    public o0(q0 q00) {
        this.a = q00;
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

