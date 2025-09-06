package com.kakao.tistory.presentation.common.graph;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u0 extends Lambda implements Function0 {
    public final Function1 a;
    public final BarGraphItem b;

    public u0(Function1 function10, BarGraphItem barGraphItem0) {
        this.a = function10;
        this.b = barGraphItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GraphPeriod graphPeriod0 = this.b.getGraphPeriod();
        this.a.invoke(graphPeriod0);
        return Unit.INSTANCE;
    }
}

