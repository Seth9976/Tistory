package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final CommentFragment a;
    public final MutableState b;

    public b0(CommentFragment commentFragment0, MutableState mutableState0) {
        this.a = commentFragment0;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CommentFragment.access$CommentListContent$lambda$8(this.b, true);
        CommentListViewModel.invalidate$default(this.a.getCommentListViewModel(), null, null, false, 7, null);
        return Unit.INSTANCE;
    }
}

