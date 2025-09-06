package io.reactivex.internal.util;

import org.reactivestreams.Subscriber;

public interface QueueDrain {
    boolean accept(Subscriber arg1, Object arg2);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int arg1);

    long produced(long arg1);

    long requested();
}

