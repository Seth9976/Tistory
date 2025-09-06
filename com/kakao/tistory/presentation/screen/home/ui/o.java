package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final BoxWithConstraintsScope a;
    public final List b;
    public final LazyStaggeredGridState c;
    public final ArrayList d;
    public final Function1 e;

    public o(BoxWithConstraintsScope boxWithConstraintsScope0, List list0, LazyStaggeredGridState lazyStaggeredGridState0, ArrayList arrayList0, Function1 function10) {
        this.a = boxWithConstraintsScope0;
        this.b = list0;
        this.c = lazyStaggeredGridState0;
        this.d = arrayList0;
        this.e = function10;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDB5F3FF0, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeSlotList.<anonymous>.<anonymous> (HomeSlotList.kt:45)");
        }
        HomeSlotListKt.access$MultiLane(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), LazyStaggeredGridState.$stable << 6 | 0x1040);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

