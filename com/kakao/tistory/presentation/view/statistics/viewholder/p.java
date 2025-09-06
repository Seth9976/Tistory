package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final StatisticsRefererKeywordViewHolder a;
    public final RefererKeywordItem b;
    public final StatisticsViewModel c;
    public final Function1 d;
    public final int e;

    public p(StatisticsRefererKeywordViewHolder statisticsRefererKeywordViewHolder0, RefererKeywordItem statisticsItem$RefererKeywordItem0, StatisticsViewModel statisticsViewModel0, Function1 function10, int v) {
        this.a = statisticsRefererKeywordViewHolder0;
        this.b = statisticsItem$RefererKeywordItem0;
        this.c = statisticsViewModel0;
        this.d = function10;
        this.e = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererKeyword(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

