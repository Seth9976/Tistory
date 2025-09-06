package com.kakao.tistory.presentation.view.entry.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function0 {
    public final ReplyType a;
    public final Function1 b;

    public q(ReplyType replyType0, Function1 function10) {
        this.a = replyType0;
        this.b = function10;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ReplyType replyType0 = this.a;
        if(replyType0 == ReplyType.Mention) {
            this.b.invoke(replyType0);
        }
        return Unit.INSTANCE;
    }
}

