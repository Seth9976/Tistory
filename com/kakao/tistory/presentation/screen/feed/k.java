package com.kakao.tistory.presentation.screen.feed;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final FeedViewModel a;
    public final LazyPagingItems b;

    public k(FeedViewModel feedViewModel0, LazyPagingItems lazyPagingItems0) {
        this.a = feedViewModel0;
        this.b = lazyPagingItems0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FeedScreenKt.access$refresh(this.a, this.b);
        return Unit.INSTANCE;
    }
}

