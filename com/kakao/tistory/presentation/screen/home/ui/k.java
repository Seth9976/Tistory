package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final LazyStaggeredGridState a;

    public k(LazyStaggeredGridState lazyStaggeredGridState0) {
        this.a = lazyStaggeredGridState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = this.a.getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list0, 10));
        for(Object object0: list0) {
            arrayList0.add(HomeSlotArrangedKt.access$toMeasuredGridItem(((LazyStaggeredGridItemInfo)object0)));
        }
        return arrayList0;
    }
}

