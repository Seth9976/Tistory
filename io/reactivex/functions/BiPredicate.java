package io.reactivex.functions;

import io.reactivex.annotations.NonNull;

public interface BiPredicate {
    boolean test(@NonNull Object arg1, @NonNull Object arg2) throws Exception;
}

