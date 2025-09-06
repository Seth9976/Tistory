package com.kakao.tistory.presentation.view.common;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class q extends FunctionReferenceImpl implements Function0 {
    public q(LazyPagingItems lazyPagingItems0) {
        super(0, lazyPagingItems0, LazyPagingItems.class, "retry", "retry()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((LazyPagingItems)this.receiver).retry();
        return Unit.INSTANCE;
    }
}

