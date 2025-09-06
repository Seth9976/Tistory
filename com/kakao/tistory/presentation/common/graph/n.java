package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function3 {
    public static final n a;

    static {
        n.a = new n();
    }

    public n() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1314804955, v, -1, "com.kakao.tistory.presentation.common.graph.ComposableSingletons$StatisticsBarGraphKt.lambda-2.<anonymous> (StatisticsBarGraph.kt:170)");
        }
        DividerKt.Divider-oMI9zvI(BackgroundKt.background-bw27NRU$default(Modifier.Companion, TColor.INSTANCE.getWhite-0d7_KjU(), null, 2, null), 0L, 0.0f, 0.0f, ((Composer)object1), 6, 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

