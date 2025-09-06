package com.kakao.tistory.presentation.screen.feed;

import androidx.compose.runtime.MutableState;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final FeedViewModel a;
    public final LazyPagingItems b;
    public final MutableState c;

    public m(FeedViewModel feedViewModel0, LazyPagingItems lazyPagingItems0, MutableState mutableState0) {
        this.a = feedViewModel0;
        this.b = lazyPagingItems0;
        this.c = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FeedScreenKt.access$FeedScreen$lambda$5(this.c, true);
        FeedScreenKt.access$refresh(this.a, this.b);
        return Unit.INSTANCE;
    }
}

