package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import java.util.concurrent.Callable;

public final class l2 implements Callable {
    public final int a;
    public final int b;
    public final Object c;

    public l2(Object object0, int v, int v1) {
        this.a = v1;
        this.c = object0;
        this.b = v;
        super();
    }

    @Override
    public final Object call() {
        return this.a != 0 ? ((Observable)this.c).replay(this.b) : ((Flowable)this.c).replay(this.b);
    }
}

