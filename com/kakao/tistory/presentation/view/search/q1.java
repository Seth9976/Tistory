package com.kakao.tistory.presentation.view.search;

import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class q1 extends FunctionReferenceImpl implements Function0 {
    public q1(Object object0) {
        super(0, object0, LazyPagingItems.class, "refresh", "refresh()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((LazyPagingItems)this.receiver).refresh();
        return Unit.INSTANCE;
    }
}

