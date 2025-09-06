package com.kakao.tistory.presentation.view.common.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function0 {
    public final TistoryToolbarActivity a;

    public x(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.m = this.a.k;
        return Unit.INSTANCE;
    }
}

