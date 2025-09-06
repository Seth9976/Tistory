package com.kakao.tistory.presentation.view.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public static final k a;

    static {
        k.a = new k();
    }

    public k() {
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Unit.INSTANCE;
    }
}

