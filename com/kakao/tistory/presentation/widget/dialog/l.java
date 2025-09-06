package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
        Intrinsics.checkNotNullParameter(((DialogButton)object0), "it");
        return Unit.INSTANCE;
    }
}

