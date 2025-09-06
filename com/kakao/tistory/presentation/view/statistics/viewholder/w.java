package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function2 {
    public final StatisticsRefererKeywordViewHolder a;
    public final RefererKeywordItem b;
    public final StatisticsViewModel c;
    public final int d;

    public w(StatisticsRefererKeywordViewHolder statisticsRefererKeywordViewHolder0, RefererKeywordItem statisticsItem$RefererKeywordItem0, StatisticsViewModel statisticsViewModel0, int v) {
        this.a = statisticsRefererKeywordViewHolder0;
        this.b = statisticsItem$RefererKeywordItem0;
        this.c = statisticsViewModel0;
        this.d = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererKeywordInfo(this.b, this.c, ((Composer)object0), (this.d | 1) & -920350135 | ((0x24924924 & (this.d | 1)) >> 1 | 306783378 & (this.d | 1)) | (306783378 & (this.d | 1)) << 1 & (0x24924924 & (this.d | 1)));
        return Unit.INSTANCE;
    }
}

