package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.data.model.viewtype.StatisticsViewType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final Title a;
    public final StatisticsAdapter b;

    public k(Title statisticsItem$Title0, StatisticsAdapter statisticsAdapter0) {
        this.a = statisticsItem$Title0;
        this.b = statisticsAdapter0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.a.getChildViewType() == StatisticsViewType.TOP_POST) {
            this.b.b.onClickTopPostSeeAll();
        }
        return Unit.INSTANCE;
    }
}

