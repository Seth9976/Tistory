package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final BoxWithConstraintsScope a;
    public final List b;
    public final LazyStaggeredGridState c;
    public final List d;
    public final Function1 e;
    public final int f;

    public u(BoxWithConstraintsScope boxWithConstraintsScope0, List list0, LazyStaggeredGridState lazyStaggeredGridState0, List list1, Function1 function10, int v) {
        this.a = boxWithConstraintsScope0;
        this.b = list0;
        this.c = lazyStaggeredGridState0;
        this.d = list1;
        this.e = function10;
        this.f = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        HomeSlotListKt.access$MultiLane(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
        return Unit.INSTANCE;
    }
}

