package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;

public abstract class GroupedFlowable extends Flowable {
    public final Object b;

    public GroupedFlowable(@Nullable Object object0) {
        this.b = object0;
    }

    @Nullable
    public Object getKey() {
        return this.b;
    }
}

