package com.kakao.tistory.presentation.view.editor;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v4 extends Lambda implements Function0 {
    public final Function1 a;
    public final String b;

    public v4(Function1 function10, String s) {
        this.a = function10;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

