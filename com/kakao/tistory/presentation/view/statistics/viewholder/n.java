package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.ComposeView;
import com.kakao.tistory.data.model.StatisticsItem.RefererChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final StatisticsRefererChannelViewHolder a;
    public final RefererChannel b;

    public n(StatisticsRefererChannelViewHolder statisticsRefererChannelViewHolder0, RefererChannel statisticsItem$RefererChannel0) {
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
            ComposerKt.traceEventStart(0x67CFB280, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererChannelViewHolder.setRefererChannel.<anonymous>.<anonymous> (StatisticsRefererChannelViewHolder.kt:37)");
        }
        this.a.RefererChannel(this.b, ((Composer)object0), ComposeView.$stable << 3 | 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

