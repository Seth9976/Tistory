package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.WriteComplete;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t1 extends Lambda implements Function1 {
    public final CommentListViewModel a;

    public t1(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CommentCompletion)object0), "it");
        WriteComplete commentListIntent$WriteComplete0 = new WriteComplete(((CommentCompletion)object0));
        this.a.sendIntent(commentListIntent$WriteComplete0);
        return Unit.INSTANCE;
    }
}

