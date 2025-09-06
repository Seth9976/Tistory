package com.kakao.tistory.presentation.view.comment;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a2 extends Lambda implements Function1 {
    public final CommentModifyViewModel a;

    public a2(CommentModifyViewModel commentModifyViewModel0) {
        this.a = commentModifyViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        return Boolean.valueOf(!CommentModifyViewModel.access$isReachCommentMaxLength(this.a, ((String)object0)));
    }
}

