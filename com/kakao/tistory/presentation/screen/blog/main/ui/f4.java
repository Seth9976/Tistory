package com.kakao.tistory.presentation.screen.blog.main.ui;

import BlogMainStatisticsTrendKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Trend;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f4 extends Lambda implements Function4 {
    public static final f4 a;

    static {
        f4.a = new f4();
    }

    public f4() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$StatisticsContainer");
        Intrinsics.checkNotNullParameter(((Trend)object1), "it");
        if((v & 0x70) == 0) {
            v |= (((Composer)object2).changed(((Trend)object1)) ? 0x20 : 16);
        }
        if((v & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x20510566, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ComposableSingletons$BlogMainStatisticsKt.lambda-1.<anonymous> (BlogMainStatistics.kt:326)");
        }
        BlogMainStatisticsTrendKt.BlogMainStatisticsTrend(((Trend)object1), ((Composer)object2), v >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

