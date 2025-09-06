package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class k extends Lambda implements Function0 {
    public final CoroutineScope a;
    public final LazyListState b;

    public k(CoroutineScope coroutineScope0, LazyListState lazyListState0) {
        this.a = coroutineScope0;
        this.b = lazyListState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j j0 = new j(this.b, null);
        return BuildersKt.launch$default(this.a, null, null, j0, 3, null);
    }
}

