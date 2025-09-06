package com.kakao.tistory.presentation.view.editor;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o5 extends Lambda implements Function1 {
    public static final o5 a;

    static {
        o5.a = new o5();
    }

    public o5() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Unit.INSTANCE;
    }
}

