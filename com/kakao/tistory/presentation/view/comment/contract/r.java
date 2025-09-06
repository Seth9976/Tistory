package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final CommentItem b;
    public final boolean c;

    public r(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0, boolean z) {
        this.a = commentListViewModel0;
        this.b = commentItemType$CommentItem0;
        this.c = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickUserImage(this.b, this.c);
        return Unit.INSTANCE;
    }
}

