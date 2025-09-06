package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.view.statistics.StatisticsTiara;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i0 extends Lambda implements Function0 {
    public final EntryItem a;

    public i0(EntryItem entryItem0) {
        this.a = entryItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StatisticsTiara.INSTANCE.trackClickPeriod(this.a == null);
        return Unit.INSTANCE;
    }
}

