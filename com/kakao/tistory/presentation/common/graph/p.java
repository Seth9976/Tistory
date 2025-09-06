package com.kakao.tistory.presentation.common.graph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final Function2 a;
    public final int b;

    public p(Function2 function20, int v) {
        this.a = function20;
        this.b = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphPeriod)object0), "graphPeriod");
        this.a.invoke(this.b, ((GraphPeriod)object0));
        return Unit.INSTANCE;
    }
}

