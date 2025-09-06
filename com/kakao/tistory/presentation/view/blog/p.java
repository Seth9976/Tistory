package com.kakao.tistory.presentation.view.blog;

import androidx.paging.compose.LazyPagingItems;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final LazyPagingItems a;

    public p(LazyPagingItems lazyPagingItems0) {
        this.a = lazyPagingItems0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.getItemCount() == 0;
    }
}

