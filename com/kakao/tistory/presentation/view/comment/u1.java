package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.common.CommentInputAcceptType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u1 extends Lambda implements Function1 {
    public final CommentListViewModel a;

    public u1(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CommentInputAcceptType)object0), "it");
        return ((CommentInputAcceptType)object0) == CommentInputAcceptType.NOT_ACCEPT ? this.a.getNotAcceptCommentRes() : this.a.getBlockedCommentRes();
    }
}

