package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final CommentItem b;
    public final Long c;

    public v1(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, Long long0) {
        this.a = commentListViewModel0;
        this.b = commentItemType$CommentItem0;
        this.c = long0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CommentListViewModel.access$deleteComment(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}

