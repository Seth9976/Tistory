package io.reactivex.parallel;

import io.reactivex.annotations.NonNull;

public interface ParallelTransformer {
    @NonNull
    ParallelFlowable apply(@NonNull ParallelFlowable arg1);
}

