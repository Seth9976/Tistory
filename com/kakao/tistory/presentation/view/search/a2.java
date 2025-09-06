package com.kakao.tistory.presentation.view.search;

import com.google.accompanist.pager.PagerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class a2 extends Lambda implements Function0 {
    public final CoroutineScope a;
    public final PagerState b;
    public final int c;

    public a2(CoroutineScope coroutineScope0, PagerState pagerState0, int v) {
        this.a = coroutineScope0;
        this.b = pagerState0;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z1 z10 = new z1(this.b, this.c, null);
        BuildersKt.launch$default(this.a, null, null, z10, 3, null);
        return Unit.INSTANCE;
    }
}

