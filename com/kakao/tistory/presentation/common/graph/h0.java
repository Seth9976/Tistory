package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function3 {
    public final ColumnScopeInstance a;
    public final float b;

    public h0(ColumnScopeInstance columnScopeInstance0, float f) {
        this.a = columnScopeInstance0;
        this.b = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        float f = ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(f) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1986702973, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsBarGraph.kt:174)");
        }
        long v1 = Color.copy-wmQWz5c$default(0L, this.b, 0.0f, 0.0f, 0.0f, 14, null);
        StatisticsBarGraphKt.access$BarGraphUnit-XO-JAsU(this.a, f, v1, ((Composer)object1), v << 3 & 0x70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

