package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.CommentItemType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final CommentListViewModel a;
    public final CommentItemType b;

    public l(CommentListViewModel commentListViewModel0, CommentItemType commentItemType0) {
        this.a = commentListViewModel0;
        this.b = commentItemType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickReply commentListIntent$ClickReply0 = new ClickReply(((CommentItem)this.b), null, 2, null);
        this.a.sendIntent(commentListIntent$ClickReply0);
        return Unit.INSTANCE;
    }
}

