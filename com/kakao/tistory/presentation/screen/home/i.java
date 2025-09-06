package com.kakao.tistory.presentation.screen.home;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class i extends Lambda implements Function0 {
    public final CoroutineScope a;
    public final LazyListState b;
    public final LazyStaggeredGridState c;

    public i(CoroutineScope coroutineScope0, LazyListState lazyListState0, LazyStaggeredGridState lazyStaggeredGridState0) {
        this.a = coroutineScope0;
        this.b = lazyListState0;
        this.c = lazyStaggeredGridState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        g g0 = new g(this.b, null);
        BuildersKt.launch$default(this.a, null, null, g0, 3, null);
        h h0 = new h(this.c, null);
        BuildersKt.launch$default(this.a, null, null, h0, 3, null);
        return Unit.INSTANCE;
    }
}

