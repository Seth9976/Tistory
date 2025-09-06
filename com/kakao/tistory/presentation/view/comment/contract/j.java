package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final CommentItem b;

    public j(CommentListViewModel commentListViewModel0, CommentItem commentItemType$CommentItem0) {
        this.a = commentListViewModel0;
        this.b = commentItemType$CommentItem0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickReply commentListIntent$ClickReply0 = new ClickReply(null, this.b);
        this.a.sendIntent(commentListIntent$ClickReply0);
        return Unit.INSTANCE;
    }
}

