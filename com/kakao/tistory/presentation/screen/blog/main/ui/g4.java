package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g4 extends Lambda implements Function4 {
    public static final g4 a;

    static {
        g4.a = new g4();
    }

    public g4() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$StatisticsContainer");
        Intrinsics.checkNotNullParameter(((RefererLog)object1), "it");
        if((v & 0x70) == 0) {
            v |= (((Composer)object2).changed(((RefererLog)object1)) ? 0x20 : 16);
        }
        if((v & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3AD64610, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ComposableSingletons$BlogMainStatisticsKt.lambda-2.<anonymous> (BlogMainStatistics.kt:337)");
        }
        BlogMainStatisticsRefererLogKt.BlogMainStatisticsRefererLog(((RefererLog)object1), ((Composer)object2), v >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

