package com.kakao.tistory.presentation.screen.revenue;

import com.kakao.tistory.presentation.common.graph.GraphPeriod;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final Function4 a;
    public final String b;
    public final GraphPeriodType c;

    public e(Function4 function40, String s, GraphPeriodType graphPeriodType0) {
        this.a = function40;
        this.b = s;
        this.c = graphPeriodType0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((GraphPeriod)object1), "graphPeriod");
        this.a.invoke(this.b, this.c, ((GraphPeriod)object1), ((Number)object0).intValue());
        return Unit.INSTANCE;
    }
}

