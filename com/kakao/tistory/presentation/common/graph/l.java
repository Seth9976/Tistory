package com.kakao.tistory.presentation.common.graph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public static final l a;

    static {
        l.a = new l();
    }

    public l() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((Number)object0).intValue();
        return Unit.INSTANCE;
    }
}

