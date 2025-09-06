package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function0 {
    public final LazyListState a;

    public e0(LazyListState lazyListState0) {
        this.a = lazyListState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.getFirstVisibleItemIndex() < 2 ? false : true;
    }
}

