package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function2 {
    public final RefererRankItem a;
    public final Function0 b;

    public b0(RefererRankItem statisticsItem$RefererRankItem0, Function0 function00) {
        this.a = statisticsItem$RefererRankItem0;
        this.b = function00;
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
            ComposerKt.traceEventStart(0xDD80BCB9, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererRankViewHolder.setRefererRank.<anonymous>.<anonymous> (StatisticsRefererRankViewHolder.kt:43)");
        }
        StatisticsRefererRankViewHolderKt.access$RefererRank(this.a, this.b, ((Composer)object0), 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

