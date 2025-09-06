package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.presentation.view.statistics.StatisticsTiara;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function0 {
    public final TopViewModel a;

    public h0(TopViewModel topViewModel0) {
        this.a = topViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StatisticsTiara.INSTANCE.trackClickMetric();
        this.a.onClickMetricSort();
        return Unit.INSTANCE;
    }
}

