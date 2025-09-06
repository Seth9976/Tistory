package com.kakao.tistory.presentation.screen.revenue;

import androidx.compose.material3.TopAppBarScrollBehavior;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final TopAppBarScrollBehavior a;

    public b0(TopAppBarScrollBehavior topAppBarScrollBehavior0) {
        this.a = topAppBarScrollBehavior0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Math.abs(this.a.getState().getCollapsedFraction());
    }
}

