package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function2 {
    public final RefererRankItem a;
    public final Function0 b;
    public final int c;

    public d0(RefererRankItem statisticsItem$RefererRankItem0, Function0 function00, int v) {
        this.a = statisticsItem$RefererRankItem0;
        this.b = function00;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        StatisticsRefererRankViewHolderKt.access$RefererRank(this.a, this.b, ((Composer)object0), (this.c | 1) & -920350135 | ((0x24924924 & (this.c | 1)) >> 1 | 306783378 & (this.c | 1)) | (306783378 & (this.c | 1)) << 1 & (0x24924924 & (this.c | 1)));
        return Unit.INSTANCE;
    }
}

