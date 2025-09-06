package com.kakao.tistory.presentation.widget.dialog;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class t0 extends Lambda implements Function0 {
    public final Function1 a;

    public t0(Function1 function10) {
        this.a = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(DialogButton.RIGHT);
        return Unit.INSTANCE;
    }
}

