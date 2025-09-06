package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.comment.contract.CommentModifyEvent.BackToList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d2 extends Lambda implements Function0 {
    public final CommentModifyViewModel a;

    public d2(CommentModifyViewModel commentModifyViewModel0) {
        this.a = commentModifyViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BackToList commentModifyEvent$BackToList0 = new BackToList(null, 1, null);
        this.a.sendEvent(commentModifyEvent$BackToList0);
        return Unit.INSTANCE;
    }
}

