package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function2 {
    public final PagerState a;
    public final int b;
    public final int c;
    public final int d;

    public y1(PagerState pagerState0, int v, int v1, int v2) {
        this.a = pagerState0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        PageIndicatorKt.PageIndicator(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)), this.d);
        return Unit.INSTANCE;
    }
}

