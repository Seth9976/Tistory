package com.kakao.tistory;

import android.view.View;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.internal.Preconditions;

public final class l implements Builder {
    public View a;

    @Override  // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public final ViewComponent build() {
        Preconditions.checkBuilderRequirement(this.a, View.class);
        return new m();  // 初始化器: Lcom/kakao/tistory/TistoryApplication_HiltComponents$ViewC;-><init>()V
    }

    @Override  // dagger.hilt.android.internal.builders.ViewComponentBuilder
    public final ViewComponentBuilder view(View view0) {
        this.a = (View)Preconditions.checkNotNull(view0);
        return this;
    }
}

