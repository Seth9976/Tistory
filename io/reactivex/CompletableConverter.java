package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface CompletableConverter {
    @NonNull
    Object apply(@NonNull Completable arg1);
}

