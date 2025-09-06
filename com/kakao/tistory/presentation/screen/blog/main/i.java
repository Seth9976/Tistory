package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.lazy.LazyListState;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

public final class i extends Lambda implements Function0 {
    public final CoroutineScope a;
    public final LazyListState b;
    public final BlogMainUiState c;
    public final int d;

    public i(CoroutineScope coroutineScope0, LazyListState lazyListState0, BlogMainUiState blogMainUiState0, int v) {
        this.a = coroutineScope0;
        this.b = lazyListState0;
        this.c = blogMainUiState0;
        this.d = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        h h0 = new h(this.b, this.c, this.d, null);
        return BuildersKt.launch$default(this.a, null, null, h0, 3, null);
    }
}

