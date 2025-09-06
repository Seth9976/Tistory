package com.kakao.tistory.presentation.view.statistics.viewholder;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment.Horizontal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function2 {
    public final StatisticsRefererChannelViewHolder a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final Horizontal e;
    public final int f;
    public final int g;

    public l(StatisticsRefererChannelViewHolder statisticsRefererChannelViewHolder0, int v, Integer integer0, Integer integer1, Horizontal alignment$Horizontal0, int v1, int v2) {
        this.a = statisticsRefererChannelViewHolder0;
        this.b = v;
        this.c = integer0;
        this.d = integer1;
        this.e = alignment$Horizontal0;
        this.f = v1;
        this.g = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.RefererChannelContainer(this.b, this.c, this.d, this.e, ((Composer)object0), (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)), this.g);
        return Unit.INSTANCE;
    }
}

