package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface SingleConverter {
    @NonNull
    Object apply(@NonNull Single arg1);
}

