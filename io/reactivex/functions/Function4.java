package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

public interface Function4 {
    @NonNull
    Object apply(@NonNull Object arg1, @NonNull Object arg2, @NonNull Object arg3, @NonNull Object arg4) throws Exception;
}

