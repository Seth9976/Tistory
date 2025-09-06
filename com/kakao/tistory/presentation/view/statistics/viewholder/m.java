package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function2 {
    public final StatisticsRefererChannelViewHolder a;
    public final int b;
    public final Integer c;
    public final int d;
    public final int e;

    public m(StatisticsRefererChannelViewHolder statisticsRefererChannelViewHolder0, int v, Integer integer0, int v1, int v2) {
        this.a = statisticsRefererChannelViewHolder0;
        this.b = v;
        this.c = integer0;
        this.d = v1;
        this.e = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererChannelTitle(this.b, this.c, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e);
        return Unit.INSTANCE;
    }
}

