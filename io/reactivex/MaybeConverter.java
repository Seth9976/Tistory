package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface MaybeConverter {
    @NonNull
    Object apply(@NonNull Maybe arg1);
}

