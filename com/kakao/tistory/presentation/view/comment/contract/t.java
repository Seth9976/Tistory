package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final CommentListViewModel a;

    public t(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickContentReadMore();
        return Unit.INSTANCE;
    }
}

