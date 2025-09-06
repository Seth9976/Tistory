package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final LazyListState a;
    public final BlogMainUiState b;
    public final Function4 c;
    public final int d;

    public w(LazyListState lazyListState0, BlogMainUiState blogMainUiState0, Function4 function40, int v) {
        this.a = lazyListState0;
        this.b = blogMainUiState0;
        this.c = function40;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainScreenKt.access$BlogMainContentAppBar(this.a, this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

