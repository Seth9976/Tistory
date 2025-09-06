package com.kakao.tistory.presentation.view.comment;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final CommentActivity a;
    public final CommentListViewModel b;

    public d(CommentActivity commentActivity0, CommentListViewModel commentListViewModel0) {
        this.a = commentActivity0;
        this.b = commentListViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        c c0 = new c(this.b);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, ((ErrorModel)object0).getTitle(), null, false, null, c0, null, 92, null);
        return Unit.INSTANCE;
    }
}

