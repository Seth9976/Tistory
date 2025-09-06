package com.kakao.tistory.presentation.view.comment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class y1 extends FunctionReferenceImpl implements Function1 {
    public y1(CommentModifyViewModel commentModifyViewModel0) {
        super(1, commentModifyViewModel0, CommentModifyViewModel.class, "onClickWriteModifyCloseButton", "onClickWriteModifyCloseButton(Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CommentModifyViewModel.access$onClickWriteModifyCloseButton(((CommentModifyViewModel)this.receiver), ((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }
}

