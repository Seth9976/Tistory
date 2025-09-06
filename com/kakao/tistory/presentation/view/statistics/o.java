package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final EntryItem a;
    public final SortItem b;

    public o(EntryItem entryItem0, SortItem sortItem0) {
        this.a = entryItem0;
        this.b = sortItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StatisticsTiara statisticsTiara0 = StatisticsTiara.INSTANCE;
        boolean z = this.a == null;
        String s = this.b.getTitle();
        if(s == null) {
            s = "";
        }
        statisticsTiara0.trackClickPeriodItem(z, s);
        return Unit.INSTANCE;
    }
}

