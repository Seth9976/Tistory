package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j3 extends Lambda implements Function2 {
    public final Revenue a;
    public final int b;

    public j3(Revenue statisticsItem$Revenue0, int v) {
        this.a = statisticsItem$Revenue0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BlogMainStatisticsRevenueKt.BlogMainStatisticsRevenue(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

