package com.kakao.tistory.presentation.view.entry.widget;

import com.kakao.tistory.presentation.view.comment.contract.CommentModifyModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function1 {
    public final CommentModifyModel a;

    public b1(CommentModifyModel commentModifyModel0) {
        this.a = commentModifyModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((CommentCompletion)object0), "it");
        if(((Boolean)this.a.getCheckTextValidation().invoke(((CommentCompletion)object0).getText())).booleanValue()) {
            CommentCompletion commentCompletion0 = CommentCompletion.copy$default(((CommentCompletion)object0), this.a.getOrigin().getId(), null, null, null, false, 30, null);
            this.a.getOnClickComplete().invoke(Boolean.valueOf(this.a.getOrigin().isPinned()), commentCompletion0);
        }
        return Unit.INSTANCE;
    }
}

