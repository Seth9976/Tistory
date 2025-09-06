package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final List a;
    public final LazyListState b;
    public final Function1 c;

    public n(List list0, LazyListState lazyListState0, Function1 function10) {
        this.a = list0;
        this.b = lazyListState0;
        this.c = function10;
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
            ComposerKt.traceEventStart(0x25DBCC59, v, -1, "com.kakao.tistory.presentation.screen.home.ui.HomeSlotList.<anonymous>.<anonymous> (HomeSlotList.kt:37)");
        }
        HomeSlotListKt.access$SingleLane(this.a, this.b, this.c, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

