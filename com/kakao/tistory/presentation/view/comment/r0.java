package com.kakao.tistory.presentation.view.comment;

import androidx.paging.LoadState.Loading;
import androidx.paging.compose.LazyPagingItems;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function0 {
    public final LazyPagingItems a;

    public r0(LazyPagingItems lazyPagingItems0) {
        this.a = lazyPagingItems0;
        super(0);
    }

    // 去混淆评级： 低(30)
    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.getLoadState().getSource().getAppend() instanceof Loading || this.a.getLoadState().getSource().getPrepend() instanceof Loading || this.a.getLoadState().getSource().getRefresh() instanceof Loading;
    }
}

