package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsMetricSortType;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function2 {
    public final StatisticsTrendViewHolder a;
    public final String b;
    public final StatisticsMetricSortType c;
    public final StatisticsViewModel d;
    public final int e;

    public b1(StatisticsTrendViewHolder statisticsTrendViewHolder0, String s, StatisticsMetricSortType statisticsViewModel$StatisticsMetricSortType0, StatisticsViewModel statisticsViewModel0, int v) {
        this.a = statisticsTrendViewHolder0;
        this.b = s;
        this.c = statisticsViewModel$StatisticsMetricSortType0;
        this.d = statisticsViewModel0;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.StatisticsTrendVisitCount(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

