package com.kakao.tistory.presentation.view.comment.entry;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class g extends ContinuationImpl {
    public PostCommentViewModel a;
    public Object b;
    public final PostCommentViewModel c;
    public int d;

    public g(PostCommentViewModel postCommentViewModel0, Continuation continuation0) {
        this.c = postCommentViewModel0;
        super(continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        this.b = object0;
        this.d |= 0x80000000;
        return PostCommentViewModel.a(this.c, null, this);
    }
}

