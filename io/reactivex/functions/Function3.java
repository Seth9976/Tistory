package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

public interface Function3 {
    @NonNull
    Object apply(@NonNull Object arg1, @NonNull Object arg2, @NonNull Object arg3) throws Exception;
}

