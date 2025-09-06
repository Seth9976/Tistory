package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final PostCommentActivity a;

    public c(PostCommentActivity postCommentActivity0) {
        this.a = postCommentActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        NavigatorExtensionKt.goToPinComment(this.a, ((EntryItem)object0), 10005);
        return Unit.INSTANCE;
    }
}

