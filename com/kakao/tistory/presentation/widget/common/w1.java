package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function0 {
    public final PagerState a;
    public final State b;

    public w1(PagerState pagerState0, State state0) {
        this.a = pagerState0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (int)(this.a.getCurrentPage() % PageIndicatorKt.access$PageIndicator$lambda$6$lambda$1(this.b));
    }
}

