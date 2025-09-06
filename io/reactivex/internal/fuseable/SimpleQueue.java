package io.reactivex.internal.fuseable;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;

public interface SimpleQueue {
    void clear();

    boolean isEmpty();

    boolean offer(@NonNull Object arg1);

    boolean offer(@NonNull Object arg1, @NonNull Object arg2);

    @Nullable
    Object poll() throws Exception;
}

