package com.kakao.tistory.presentation.view.comment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w1 extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final long b;

    public w1(CommentListViewModel commentListViewModel0, long v) {
        this.a = commentListViewModel0;
        this.b = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.pinComment(this.b, true);
        this.a.sendActivityResultEvent(this.b, CommentActivityResultType.Updated);
        return Unit.INSTANCE;
    }
}

