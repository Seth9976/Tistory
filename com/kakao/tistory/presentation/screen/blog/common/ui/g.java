package com.kakao.tistory.presentation.screen.blog.common.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final Function1 a;

    public g(Function1 function10) {
        this.a = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(r.b);
        return Unit.INSTANCE;
    }
}

