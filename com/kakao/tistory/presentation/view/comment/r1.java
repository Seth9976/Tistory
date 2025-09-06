package com.kakao.tistory.presentation.view.comment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class r1 extends FunctionReferenceImpl implements Function1 {
    public r1(CommentListViewModel commentListViewModel0) {
        super(1, commentListViewModel0, CommentListViewModel.class, "completeInitLoad", "completeInitLoad(Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((CommentListViewModel)this.receiver).completeInitLoad(((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }
}

