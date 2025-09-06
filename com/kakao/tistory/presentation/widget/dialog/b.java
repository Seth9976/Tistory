package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function0 a;

    public b(Function0 function00) {
        this.a = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

