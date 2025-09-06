package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h4 extends Lambda implements Function4 {
    public static final h4 a;

    static {
        h4.a = new h4();
    }

    public h4() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$StatisticsContainer");
        Intrinsics.checkNotNullParameter(((RefererKeyword)object1), "it");
        if((v & 0x70) == 0) {
            v |= (((Composer)object2).changed(((RefererKeyword)object1)) ? 0x20 : 16);
        }
        if((v & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x58ADED30, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ComposableSingletons$BlogMainStatisticsKt.lambda-3.<anonymous> (BlogMainStatistics.kt:347)");
        }
        BlogMainStatisticsRefererKeywordKt.BlogMainStatisticsRefererKeyword(((RefererKeyword)object1), ((Composer)object2), v >> 3 & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

