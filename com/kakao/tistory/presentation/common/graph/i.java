package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final List a;
    public final float b;
    public final MutableState c;

    public i(List list0, float f, MutableState mutableState0) {
        this.a = list0;
        this.b = f;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = Math.min(((int)(BlogTwinBarGraphKt.access$BlogTwinBarGraph$lambda$1(this.c) / this.b)), 7);
        return Math.min(this.a.size(), v);
    }
}

