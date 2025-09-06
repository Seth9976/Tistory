package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final Function0 a;
    public final Function0 b;

    public f(Function0 function00, Function0 function01) {
        this.a = function00;
        this.b = function01;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

