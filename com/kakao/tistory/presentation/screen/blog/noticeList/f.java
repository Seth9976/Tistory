package com.kakao.tistory.presentation.screen.blog.noticeList;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final LazyPagingItems a;

    public f(LazyPagingItems lazyPagingItems0) {
        this.a = lazyPagingItems0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LazyPagingItems lazyPagingItems0 = this.a;
        if(lazyPagingItems0 != null) {
            lazyPagingItems0.refresh();
        }
        return Unit.INSTANCE;
    }
}

