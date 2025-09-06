package com.kakao.tistory.presentation.screen.home.item;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;

public final class b0 extends Lambda implements Function0 {
    public final Page a;

    public b0(Page homeSlotUiState$Page0) {
        this.a = homeSlotUiState$Page0;
        super(0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.getContents().isEmpty() ? 0 : c.coerceAtLeast(this.a.getContents().size() / this.a.getContentsPerPage(), 1);
    }
}

