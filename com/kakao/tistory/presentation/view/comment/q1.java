package com.kakao.tistory.presentation.view.comment;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function1 {
    public final CommentListViewModel a;

    public q1(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Boolean.valueOf(!CommentListViewModel.access$isReachCommentMaxLength(this.a, ((String)object0)));
    }
}

