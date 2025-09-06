package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class h extends Lambda implements Function0 {
    public final MutableState a;
    public final State b;

    public h(MutableState mutableState0, State state0) {
        this.a = mutableState0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Dp.box-impl(Dp.constructor-impl(BlogTwinBarGraphKt.access$BlogTwinBarGraph$lambda$1(this.a) / ((float)c.coerceAtLeast(BlogTwinBarGraphKt.access$BlogTwinBarGraph$lambda$7(this.b), 1))));
    }
}

