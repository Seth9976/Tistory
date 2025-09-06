package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final Function1 a;
    public final ReplyType b;

    public p(Function1 function10, ReplyType replyType0) {
        this.a = function10;
        this.b = replyType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

