package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

public interface IntFunction {
    @NonNull
    Object apply(int arg1) throws Exception;
}

