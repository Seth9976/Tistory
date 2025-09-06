package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference {
    public boolean addThrowable(Throwable throwable0) {
        return ExceptionHelper.addThrowable(this, throwable0);
    }

    public boolean isTerminated() {
        return this.get() == ExceptionHelper.TERMINATED;
    }

    public Throwable terminate() {
        return ExceptionHelper.terminate(this);
    }
}

