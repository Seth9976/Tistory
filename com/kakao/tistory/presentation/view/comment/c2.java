package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.comment.contract.CommentModifyIntent.WriteComplete;
import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function0 {
    public final CommentModifyViewModel a;
    public final CommentCompletion b;

    public c2(CommentModifyViewModel commentModifyViewModel0, CommentCompletion commentCompletion0) {
        this.a = commentModifyViewModel0;
        this.b = commentCompletion0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WriteComplete commentModifyIntent$WriteComplete0 = new WriteComplete(true, this.b);
        this.a.sendIntent(commentModifyIntent$WriteComplete0);
        return Unit.INSTANCE;
    }
}

