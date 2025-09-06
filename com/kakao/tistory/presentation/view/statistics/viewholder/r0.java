package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.presentation.viewmodel.StatisticsTopEntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class r0 extends Lambda implements Function2 {
    public final StatisticsTopEntryItem a;
    public final int b;

    public r0(StatisticsTopEntryItem statisticsTopEntryItem0, int v) {
        this.a = statisticsTopEntryItem0;
        this.b = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        StatisticsTopPostViewHolderKt.access$StatisticsTopPost(this.a, ((Composer)object0), (this.b | 1) & -920350135 | ((0x24924924 & (this.b | 1)) >> 1 | 306783378 & (this.b | 1)) | (306783378 & (this.b | 1)) << 1 & (0x24924924 & (this.b | 1)));
        return Unit.INSTANCE;
    }
}

