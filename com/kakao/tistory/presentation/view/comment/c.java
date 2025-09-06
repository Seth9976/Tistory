package com.kakao.tistory.presentation.view.comment;

import android.app.Dialog;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final CommentListViewModel a;

    public c(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        CommentListViewModel.invalidate$default(this.a, null, null, false, 7, null);
        return Unit.INSTANCE;
    }
}

