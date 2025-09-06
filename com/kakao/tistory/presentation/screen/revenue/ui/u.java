package com.kakao.tistory.presentation.screen.revenue.ui;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function0 {
    public final int a;
    public final Function1 b;
    public final GraphPeriodType c;
    public final MutableIntState d;

    public u(int v, Function1 function10, GraphPeriodType graphPeriodType0, MutableIntState mutableIntState0) {
        this.a = v;
        this.b = function10;
        this.c = graphPeriodType0;
        this.d = mutableIntState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevenueViewKt.access$GraphPeriodTabBar$lambda$6(this.d, this.a);
        this.b.invoke(this.c);
        return Unit.INSTANCE;
    }
}

