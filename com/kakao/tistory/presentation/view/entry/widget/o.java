package com.kakao.tistory.presentation.view.entry.widget;

import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function0 {
    public final CommentItem a;
    public final CommentItem b;

    public o(CommentItem commentItemType$CommentItem0, CommentItem commentItemType$CommentItem1) {
        this.a = commentItemType$CommentItem0;
        this.b = commentItemType$CommentItem1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CommentItem commentItemType$CommentItem0 = this.a;
        if(commentItemType$CommentItem0 != null) {
            return TuplesKt.to(ReplyType.Mention, commentItemType$CommentItem0);
        }
        return this.b == null ? TuplesKt.to(ReplyType.None, null) : TuplesKt.to(ReplyType.Parent, this.b);
    }
}

