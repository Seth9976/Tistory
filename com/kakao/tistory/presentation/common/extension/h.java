package com.kakao.tistory.presentation.common.extension;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        this.a.invoke(object0);
        return Unit.INSTANCE;
    }
}

