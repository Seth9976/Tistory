package io.reactivex.internal.util;

import io.reactivex.Observer;

public interface ObservableQueueDrain {
    void accept(Observer arg1, Object arg2);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int arg1);
}

