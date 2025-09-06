package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RemoveReply;
import com.kakao.tistory.presentation.view.entry.widget.ReplyType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s1 extends Lambda implements Function1 {
    public final CommentListViewModel a;

    public s1(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ReplyType)object0), "it");
        RemoveReply commentListIntent$RemoveReply0 = new RemoveReply(((ReplyType)object0));
        this.a.sendIntent(commentListIntent$RemoveReply0);
        return Unit.INSTANCE;
    }
}

