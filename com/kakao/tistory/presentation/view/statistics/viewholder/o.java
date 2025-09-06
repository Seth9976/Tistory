package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.data.model.StatisticsItem.RefererChannel;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final StatisticsRefererChannelViewHolder a;
    public final RefererChannel b;

    public o(StatisticsRefererChannelViewHolder statisticsRefererChannelViewHolder0, RefererChannel statisticsItem$RefererChannel0) {
        this.a = statisticsRefererChannelViewHolder0;
        this.b = statisticsItem$RefererChannel0;
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
            ComposerKt.traceEventStart(0x9A107029, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder.setRefererChannel.<anonymous> (StatisticsRefererChannelViewHolder.kt:36)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0x67CFB280, true, new n(this.a, this.b), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

