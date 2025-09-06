package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a1 extends Lambda implements Function2 {
    public final StatisticsTrendViewHolder a;
    public final Trend b;
    public final int c;

    public a1(StatisticsTrendViewHolder statisticsTrendViewHolder0, Trend statisticsItem$Trend0, int v) {
        this.a = statisticsTrendViewHolder0;
        this.b = statisticsItem$Trend0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.StatisticsTrendLastUpdateTime(this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

