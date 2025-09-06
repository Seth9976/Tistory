package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function0 {
    public final LazyListState a;

    public k0(LazyListState lazyListState0) {
        this.a = lazyListState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.a.getFirstVisibleItemIndex() >= 1);
    }
}

