package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function0 {
    public final CommentListViewModel a;

    public i(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClickReply commentListIntent$ClickReply0 = new ClickReply(null, null);
        this.a.sendIntent(commentListIntent$ClickReply0);
        return Unit.INSTANCE;
    }
}

