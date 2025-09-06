package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final CommentListViewModel a;

    public s(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        this.a.onClickLink(((String)object0));
        return Unit.INSTANCE;
    }
}

