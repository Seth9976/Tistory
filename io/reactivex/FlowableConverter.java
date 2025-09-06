package io.reactivex;

import io.reactivex.annotations.NonNull;

public interface FlowableConverter {
    @NonNull
    Object apply(@NonNull Flowable arg1);
}

