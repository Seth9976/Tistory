package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y0 extends Lambda implements Function0 {
    public final LazyListState a;
    public final State b;

    public y0(LazyListState lazyListState0, State state0) {
        this.a = lazyListState0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)CollectionsKt___CollectionsKt.lastOrNull(this.a.getLayoutInfo().getVisibleItemsInfo());
        int v = lazyListItemInfo0 == null ? -6 : lazyListItemInfo0.getIndex();
        List list0 = StatisticsTrendViewHolder.access$StatisticsTrendGraph$lambda$16(this.b);
        return Boolean.valueOf(v >= (list0 == null ? 0 : list0.size()) - 5);
    }
}

