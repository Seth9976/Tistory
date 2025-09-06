package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final Function1 a;
    public final boolean b;

    public y(Function1 function10, boolean z) {
        this.a = function10;
        this.b = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(Boolean.valueOf(!this.b));
        return Unit.INSTANCE;
    }
}

