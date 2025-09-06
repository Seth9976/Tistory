package com.kakao.tistory.presentation.screen.home.ui.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function0 {
    public final boolean a;
    public final Function0 b;
    public final Function0 c;

    public e0(boolean z, Function0 function00, Function0 function01) {
        this.a = z;
        this.b = function00;
        this.c = function01;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        (this.a ? this.b : this.c).invoke();
        return Unit.INSTANCE;
    }
}

