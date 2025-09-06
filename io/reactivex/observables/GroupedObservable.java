package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

public abstract class GroupedObservable extends Observable {
    public final Object a;

    public GroupedObservable(@Nullable Object object0) {
        this.a = object0;
    }

    @Nullable
    public Object getKey() {
        return this.a;
    }
}

