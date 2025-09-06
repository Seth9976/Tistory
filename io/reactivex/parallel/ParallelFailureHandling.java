package io.reactivex.parallel;

import io.reactivex.functions.BiFunction;

public enum ParallelFailureHandling implements BiFunction {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    public ParallelFailureHandling apply(Long long0, Throwable throwable0) {
        return this;
    }

    @Override  // io.reactivex.functions.BiFunction
    public Object apply(Object object0, Object object1) throws Exception {
        return this.apply(((Long)object0), ((Throwable)object1));
    }
}

