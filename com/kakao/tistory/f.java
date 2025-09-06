package com.kakao.tistory;

import androidx.fragment.app.Fragment;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.internal.Preconditions;

public final class f implements Builder {
    public final k a;
    public final e b;
    public final b c;
    public Fragment d;

    public f(k k0, e e0, b b0) {
        this.a = k0;
        this.b = e0;
        this.c = b0;
    }

    @Override  // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponent build() {
        Preconditions.checkBuilderRequirement(this.d, Fragment.class);
        return new g(this.a, this.b, this.c);
    }

    @Override  // dagger.hilt.android.internal.builders.FragmentComponentBuilder
    public final FragmentComponentBuilder fragment(Fragment fragment0) {
        this.d = (Fragment)Preconditions.checkNotNull(fragment0);
        return this;
    }
}

