package com.kakao.tistory.presentation.view.common.base;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final TistoryToolbarActivity a;

    public i0(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.finish();
        return Unit.INSTANCE;
    }
}

