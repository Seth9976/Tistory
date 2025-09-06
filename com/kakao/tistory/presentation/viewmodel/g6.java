package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.statistics.entity.TopEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g6 extends Lambda implements Function0 {
    public final StatisticsViewModel a;
    public final TopEntry b;

    public g6(StatisticsViewModel statisticsViewModel0, TopEntry topEntry0) {
        this.a = statisticsViewModel0;
        this.b = topEntry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StatisticsViewModel.access$onClickTopPost(this.a, this.b.getId(), this.b.getTitle());
        return Unit.INSTANCE;
    }
}

