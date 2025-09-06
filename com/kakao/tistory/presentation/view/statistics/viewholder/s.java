package com.kakao.tistory.presentation.view.statistics.viewholder;

import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final Function1 a;
    public final RefererKeywordItem b;

    public s(Function1 function10, RefererKeywordItem statisticsItem$RefererKeywordItem0) {
        this.a = function10;
        this.b = statisticsItem$RefererKeywordItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke("");
        return Unit.INSTANCE;
    }
}

