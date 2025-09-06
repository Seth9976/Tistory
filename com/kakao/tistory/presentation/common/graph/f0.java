package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function3 {
    public final ColumnScopeInstance a;
    public final float b;
    public final float c;
    public final float d;

    public f0(ColumnScopeInstance columnScopeInstance0, float f, float f1, float f2) {
        this.a = columnScopeInstance0;
        this.b = f;
        this.c = f1;
        this.d = f2;
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
            ComposerKt.traceEventStart(1701196981, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StatisticsBarGraph.kt:155)");
        }
        long v1 = Color.copy-wmQWz5c$default(0L, this.b, 0.0f, 0.0f, 0.0f, 14, null);
        StatisticsBarGraphKt.access$BarGraphUnit-XO-JAsU(this.a, f, v1, ((Composer)object1), v << 3 & 0x70);
        if(this.c != 0.0f || this.d != 0.0f) {
            DividerKt.Divider-oMI9zvI(BackgroundKt.background-bw27NRU$default(Modifier.Companion, 0L, null, 2, null), 0L, 0.0f, 0.0f, ((Composer)object1), 6, 14);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

