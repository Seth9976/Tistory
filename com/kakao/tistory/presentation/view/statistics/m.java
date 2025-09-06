package com.kakao.tistory.presentation.view.statistics;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final StatisticsAdapter a;

    public m(StatisticsAdapter statisticsAdapter0) {
        this.a = statisticsAdapter0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "keyword");
        this.a.b.onClickRefererKeyword(((String)object0));
        return Unit.INSTANCE;
    }
}

