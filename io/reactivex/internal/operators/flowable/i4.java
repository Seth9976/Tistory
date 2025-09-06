package io.reactivex.internal.operators.flowable;

import java.util.concurrent.Callable;

public final class i4 implements Callable {
    public final int a;

    public i4(int v) {
        this.a = v;
    }

    @Override
    public final Object call() {
        return new n4(this.a);
    }
}

