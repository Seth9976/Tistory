package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.viewmodel.StatisticsTopEntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p0 extends Lambda implements Function2 {
    public final StatisticsTopEntryItem a;

    public p0(StatisticsTopEntryItem statisticsTopEntryItem0) {
        this.a = statisticsTopEntryItem0;
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
            ComposerKt.traceEventStart(0x64CBA6FB, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopPostViewHolder.setStatisticsTopPost.<anonymous>.<anonymous> (StatisticsTopPostViewHolder.kt:26)");
        }
        StatisticsTopEntryItem statisticsTopEntryItem0 = this.a;
        if(statisticsTopEntryItem0 != null) {
            StatisticsTopPostViewHolderKt.access$StatisticsTopPost(statisticsTopEntryItem0, ((Composer)object0), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

