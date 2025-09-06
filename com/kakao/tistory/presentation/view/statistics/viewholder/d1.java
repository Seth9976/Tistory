package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function2 {
    public final StatisticsTrendViewHolder a;
    public final Trend b;
    public final StatisticsViewModel c;

    public d1(StatisticsTrendViewHolder statisticsTrendViewHolder0, Trend statisticsItem$Trend0, StatisticsViewModel statisticsViewModel0) {
        this.a = statisticsTrendViewHolder0;
        this.b = statisticsItem$Trend0;
        this.c = statisticsViewModel0;
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
            ComposerKt.traceEventStart(0x2D47ADDE, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.setStatisticsTrend.<anonymous>.<anonymous> (StatisticsTrendViewHolder.kt:49)");
        }
        this.a.StatisticsTrend(this.b, this.c, ((Composer)object0), ComposeView.$stable << 6 | 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

