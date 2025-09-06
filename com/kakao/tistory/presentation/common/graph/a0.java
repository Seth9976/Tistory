package com.kakao.tistory.presentation.common.graph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final Function1 a;
    public final int b;

    public a0(Function1 function10, int v) {
        this.a = function10;
        this.b = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphPeriod)object0), "it");
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

