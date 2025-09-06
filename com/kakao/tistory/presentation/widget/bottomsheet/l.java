package com.kakao.tistory.presentation.widget.bottomsheet;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final Function0 a;

    public l(Function0 function00) {
        this.a = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

