package com.kakao.tistory.presentation.screen.revenue.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphPeriodType)object0), "it");
        return Unit.INSTANCE;
    }
}

