package io.reactivex.parallel;

import io.reactivex.annotations.NonNull;

public interface ParallelFlowableConverter {
    @NonNull
    Object apply(@NonNull ParallelFlowable arg1);
}

