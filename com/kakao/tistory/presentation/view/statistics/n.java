package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final StatisticsFragment a;

    public n(StatisticsFragment statisticsFragment0) {
        this.a = statisticsFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((SortItem)object0) != null) {
            StatisticsViewModel.updateSortType$default(StatisticsFragment.access$getStatisticsViewModel(this.a), null, ((SortItem)object0), 1, null);
        }
        return Unit.INSTANCE;
    }
}

