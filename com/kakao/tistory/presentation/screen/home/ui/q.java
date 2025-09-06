package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final List a;
    public final LazyListState b;
    public final LazyStaggeredGridState c;
    public final Function1 d;
    public final int e;

    public q(List list0, LazyListState lazyListState0, LazyStaggeredGridState lazyStaggeredGridState0, Function1 function10, int v) {
        this.a = list0;
        this.b = lazyListState0;
        this.c = lazyStaggeredGridState0;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HomeSlotListKt.HomeSlotList(this.a, this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

