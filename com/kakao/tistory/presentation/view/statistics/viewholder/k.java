package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.kakao.tistory.data.model.StatisticsItem.RefererChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final StatisticsRefererChannelViewHolder a;
    public final RefererChannel b;
    public final int c;

    public k(StatisticsRefererChannelViewHolder statisticsRefererChannelViewHolder0, RefererChannel statisticsItem$RefererChannel0, int v) {
        this.a = statisticsRefererChannelViewHolder0;
        this.b = statisticsItem$RefererChannel0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererChannel(this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

