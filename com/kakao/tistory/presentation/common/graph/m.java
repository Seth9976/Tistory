package com.kakao.tistory.presentation.common.graph;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public static final m a;

    static {
        m.a = new m();
    }

    public m() {
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
            ComposerKt.traceEventStart(0xB7676BD6, v, -1, "com.kakao.tistory.presentation.common.graph.ComposableSingletons$StatisticsBarGraphKt.lambda-1.<anonymous> (StatisticsBarGraph.kt:28)");
        }
        StatisticsBarGraphKt.StatisticsBarGraph-T042LqI(TistoryBarGraphKt.getStatisticsDummyItem(), 0, 0L, null, l.a, ((Composer)object0), 0x6038, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

