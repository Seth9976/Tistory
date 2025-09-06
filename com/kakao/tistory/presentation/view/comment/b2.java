package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.RemoveReply;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function0 {
    public final CommentModifyViewModel a;

    public b2(CommentModifyViewModel commentModifyViewModel0) {
        this.a = commentModifyViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RemoveReply commentModifyIntent$RemoveReply0 = new RemoveReply(ReplyType.Mention);
        this.a.sendIntent(commentModifyIntent$RemoveReply0);
        return Unit.INSTANCE;
    }
}

