package com.kakao.tistory;

import androidx.lifecycle.SavedStateHandle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.internal.Preconditions;

public final class n implements Builder {
    public final k a;
    public final e b;
    public SavedStateHandle c;
    public ViewModelLifecycle d;

    public n(k k0, e e0) {
        this.a = k0;
        this.b = e0;
    }

    @Override  // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponent build() {
        Preconditions.checkBuilderRequirement(this.c, SavedStateHandle.class);
        Preconditions.checkBuilderRequirement(this.d, ViewModelLifecycle.class);
        return new p(this.a, this.b, this.c);
    }

    @Override  // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder savedStateHandle(SavedStateHandle savedStateHandle0) {
        this.c = (SavedStateHandle)Preconditions.checkNotNull(savedStateHandle0);
        return this;
    }

    @Override  // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
    public final ViewModelComponentBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle0) {
        this.d = (ViewModelLifecycle)Preconditions.checkNotNull(viewModelLifecycle0);
        return this;
    }
}

