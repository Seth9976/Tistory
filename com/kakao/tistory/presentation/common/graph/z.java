package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function3 {
    public final Density a;
    public final float b;
    public final MutableState c;

    public z(Density density0, float f, MutableState mutableState0) {
        this.a = density0;
        this.b = f;
        this.c = mutableState0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(690691070, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous>.<anonymous> (StatisticsBarGraph.kt:63)");
        }
        BarGraphItem barGraphItem0 = new BarGraphItem(" ", " ", null, new StatisticsBarGraphValue(0.0f, 0.0f, 0.0f), 4, null);
        long v1 = Color.Companion.getTransparent-0d7_KjU();
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(1424164004, true, new y(this.a, this.b, this.c), ((Composer)object1), 54);
        TistoryBarGraphKt.TistoryBarGraphItem-vRFhKjU(null, false, barGraphItem0, v1, 0L, w.a, composableLambda0, ((Composer)object1), 0x1B0C30, 17);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

