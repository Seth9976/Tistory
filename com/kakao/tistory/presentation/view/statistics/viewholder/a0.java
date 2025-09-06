package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function2 {
    public final StatisticsRefererKeywordViewHolder a;
    public final RefererKeywordItem b;
    public final StatisticsViewModel c;
    public final Function1 d;

    public a0(StatisticsRefererKeywordViewHolder statisticsRefererKeywordViewHolder0, RefererKeywordItem statisticsItem$RefererKeywordItem0, StatisticsViewModel statisticsViewModel0, Function1 function10) {
        this.a = statisticsRefererKeywordViewHolder0;
        this.b = statisticsItem$RefererKeywordItem0;
        this.c = statisticsViewModel0;
        this.d = function10;
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
            ComposerKt.traceEventStart(0x7B5DF68, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.setRefererKeyword.<anonymous> (StatisticsRefererKeywordViewHolder.kt:46)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(2060307455, true, new z(this.a, this.b, this.c, this.d), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

