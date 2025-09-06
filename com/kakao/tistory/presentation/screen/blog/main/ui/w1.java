package com.kakao.tistory.presentation.screen.blog.main.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function0 {
    public final Function1 a;
    public final boolean b;
    public final Function0 c;

    public w1(Function1 function10, boolean z, Function0 function00) {
        this.a = function10;
        this.b = z;
        this.c = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(Boolean.valueOf(!this.b));
        this.c.invoke();
        return Unit.INSTANCE;
    }
}

