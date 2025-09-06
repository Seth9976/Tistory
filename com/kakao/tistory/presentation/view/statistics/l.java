package com.kakao.tistory.presentation.view.statistics;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final StatisticsAdapter a;

    public l(StatisticsAdapter statisticsAdapter0) {
        this.a = statisticsAdapter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.b.onClickRefererEtc();
        return Unit.INSTANCE;
    }
}

