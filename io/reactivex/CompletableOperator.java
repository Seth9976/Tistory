package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface CompletableOperator {
    @NonNull
    CompletableObserver apply(@NonNull CompletableObserver arg1) throws Exception;
}

