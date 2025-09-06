package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

public interface BiFunction {
    @NonNull
    Object apply(@NonNull Object arg1, @NonNull Object arg2) throws Exception;
}

