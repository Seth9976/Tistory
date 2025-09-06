package com.kakao.tistory;

import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.internal.Preconditions;

public final class c implements Builder {
    public final k a;
    public SavedStateHandleHolder b;

    public c(k k0) {
        this.a = k0;
    }

    @Override  // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponent build() {
        Preconditions.checkBuilderRequirement(this.b, SavedStateHandleHolder.class);
        return new e(this.a);
    }

    @Override  // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
    public final ActivityRetainedComponentBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder0) {
        this.b = (SavedStateHandleHolder)Preconditions.checkNotNull(savedStateHandleHolder0);
        return this;
    }
}

