package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final StatisticsViewModel a;

    public w0(StatisticsViewModel statisticsViewModel0) {
        this.a = statisticsViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.onClickBarGraphItem(((Number)object0).intValue());
        return Unit.INSTANCE;
    }
}

