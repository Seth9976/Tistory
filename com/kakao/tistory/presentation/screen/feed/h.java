package com.kakao.tistory.presentation.screen.feed;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final LazyPagingItems a;

    public h(LazyPagingItems lazyPagingItems0) {
        this.a = lazyPagingItems0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Long long0 = (Long)object0;
        this.a.refresh();
        return Unit.INSTANCE;
    }
}

