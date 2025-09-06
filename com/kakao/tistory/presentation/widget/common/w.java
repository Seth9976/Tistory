package com.kakao.tistory.presentation.widget.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final Function0 a;

    public w(Function0 function00) {
        this.a = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        this.a.invoke();
        return Unit.INSTANCE;
    }
}

