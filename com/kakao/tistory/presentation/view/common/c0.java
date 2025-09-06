package com.kakao.tistory.presentation.view.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function0 {
    public final VerticalVisibleViewBehavior a;

    public c0(VerticalVisibleViewBehavior verticalVisibleViewBehavior0) {
        this.a = verticalVisibleViewBehavior0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = this.a.b;
        this.a.c = v;
        return Unit.INSTANCE;
    }
}

