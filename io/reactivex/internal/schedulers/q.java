package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler.Worker;
import io.reactivex.functions.Function;

public final class q implements Function {
    public final Worker a;

    public q(Worker scheduler$Worker0) {
        this.a = scheduler$Worker0;
    }

    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) {
        return new p(this, ((u)object0));
    }
}

