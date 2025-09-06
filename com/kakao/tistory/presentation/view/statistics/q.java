package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final TopViewModel a;

    public q(TopViewModel topViewModel0) {
        this.a = topViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "it");
        StatisticsTiara statisticsTiara0 = StatisticsTiara.INSTANCE;
        String s = ((SortItem)object0).getTitle();
        if(s == null) {
            s = "";
        }
        statisticsTiara0.trackClickMetricItem(s);
        this.a.updateMetricSort(((SortItem)object0));
        return Unit.INSTANCE;
    }
}

