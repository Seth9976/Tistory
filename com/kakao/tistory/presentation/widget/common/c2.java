package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function1 {
    public static final c2 a;

    static {
        c2.a = new c2();
    }

    public c2() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
        return Unit.INSTANCE;
    }
}

