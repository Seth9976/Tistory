package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function2 {
    public final StatisticsTrendViewHolder a;
    public final Trend b;
    public final StatisticsViewModel c;

    public e1(StatisticsTrendViewHolder statisticsTrendViewHolder0, Trend statisticsItem$Trend0, StatisticsViewModel statisticsViewModel0) {
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
            ComposerKt.traceEventStart(0xD7AE1E47, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.setStatisticsTrend.<anonymous> (StatisticsTrendViewHolder.kt:48)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0x2D47ADDE, true, new d1(this.a, this.b, this.c), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

