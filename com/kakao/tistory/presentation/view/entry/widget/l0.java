package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function1 {
    public static final l0 a;

    static {
        l0.a = new l0();
    }

    public l0() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Unit.INSTANCE;
    }
}

