package com.kakao.tistory.presentation.widget;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final LazyListState a;

    public y(LazyListState lazyListState0) {
        this.a = lazyListState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v = this.a.getLayoutInfo().getTotalItemsCount();
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.lastOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        return Boolean.valueOf((lazyListItemInfo0 == null ? 0 : lazyListItemInfo0.getIndex()) + 5 > v);
    }
}

