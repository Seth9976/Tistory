package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.data.model.StatisticsItem.EmptyItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function2 {
    public final EmptyItem a;

    public b(EmptyItem statisticsItem$EmptyItem0) {
        this.a = statisticsItem$EmptyItem0;
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
            ComposerKt.traceEventStart(2009418208, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsEmptyViewHolder.setStatisticsEmpty.<anonymous>.<anonymous> (StatisticsEmptyViewHolder.kt:33)");
        }
        StatisticsEmptyViewHolderKt.access$StatisticsEmpty(this.a, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

