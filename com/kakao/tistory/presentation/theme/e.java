package com.kakao.tistory.presentation.theme;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final int a;

    public e(int v) {
        this.a = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return Math.min(this.a, ((Number)object0).intValue() / 2);
    }
}

