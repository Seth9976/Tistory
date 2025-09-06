package com.kakao.tistory.presentation.screen.home.item;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function1 {
    public static final y a;

    static {
        y.a = new y();
    }

    public y() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Number)object0).intValue();
        return Unit.INSTANCE;
    }
}

