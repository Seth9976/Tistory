package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function1 {
    public static final y1 a;

    static {
        y1.a = new y1();
    }

    public y1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "restored");
        return new z1(((float)(((Float)object0))));
    }
}

