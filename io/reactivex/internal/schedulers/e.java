package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class e implements Future {
    public final Disposable a;

    public e(Disposable disposable0) {
        this.a = disposable0;
    }

    @Override
    public final boolean cancel(boolean z) {
        this.a.dispose();
        return false;
    }

    @Override
    public final Object get() {
        return null;
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        return null;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return false;
    }
}

