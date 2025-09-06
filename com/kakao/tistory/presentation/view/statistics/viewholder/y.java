package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final StatisticsRefererKeywordViewHolder a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public y(StatisticsRefererKeywordViewHolder statisticsRefererKeywordViewHolder0, int v, int v1, long v2, int v3) {
        this.a = statisticsRefererKeywordViewHolder0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererTitleAndCount(this.b, this.c, this.d, ((Composer)object0), (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
        return Unit.INSTANCE;
    }
}

