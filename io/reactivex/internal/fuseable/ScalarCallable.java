package io.reactivex.internal.fuseable;

import java.util.concurrent.Callable;

public interface ScalarCallable extends Callable {
    @Override
    Object call();
}

