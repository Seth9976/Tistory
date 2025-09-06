package com.kakao.tistory.presentation.view.search;

import com.google.accompanist.pager.PagerState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class c2 extends Lambda implements Function0 {
    public final PagerState a;
    public final int b;

    public c2(PagerState pagerState0, int v) {
        this.a = pagerState0;
        this.b = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f = (float)this.a.getCurrentPage();
        return c.roundToInt(this.a.getCurrentPageOffset() + f) == this.b;
    }
}

