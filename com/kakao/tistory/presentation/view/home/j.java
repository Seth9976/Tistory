package com.kakao.tistory.presentation.view.home;

import com.kakao.tistory.data.model.StatisticsItem.RefererLogItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final RefererLogItem a;
    public final Function1 b;

    public j(RefererLogItem statisticsItem$RefererLogItem0, Function1 function10) {
        this.a = statisticsItem$RefererLogItem0;
        this.b = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.a.getRefUrl();
        if(s != null) {
            this.b.invoke(s);
        }
        return Unit.INSTANCE;
    }
}

