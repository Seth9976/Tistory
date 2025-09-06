package com.kakao.tistory.presentation.view.comment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function0 {
    public final Function1 a;
    public final CommentMenuItem b;

    public m(Function1 function10, CommentMenuItem commentMenuItem0) {
        this.a = function10;
        this.b = commentMenuItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

