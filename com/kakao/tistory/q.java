package com.kakao.tistory;

import android.view.View;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.internal.Preconditions;

public final class q implements Builder {
    public View a;

    @Override  // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponent build() {
        Preconditions.checkBuilderRequirement(this.a, View.class);
        return new s();  // 初始化器: Lcom/kakao/tistory/TistoryApplication_HiltComponents$ViewWithFragmentC;-><init>()V
    }

    @Override  // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
    public final ViewWithFragmentComponentBuilder view(View view0) {
        this.a = (View)Preconditions.checkNotNull(view0);
        return this;
    }
}

