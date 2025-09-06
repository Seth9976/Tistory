package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyMoreItem;
import com.kakao.tistory.domain.entity.CommentItemType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final CommentItemType b;

    public n(CommentListViewModel commentListViewModel0, CommentItemType commentItemType0) {
        this.a = commentListViewModel0;
        this.b = commentItemType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.onClickLoadMoreReply(((CommentReplyMoreItem)this.b));
        return Unit.INSTANCE;
    }
}

