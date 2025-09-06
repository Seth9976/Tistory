package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.view.entry.widget.CommentCompletion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class z1 extends FunctionReferenceImpl implements Function2 {
    public z1(CommentModifyViewModel commentModifyViewModel0) {
        super(2, commentModifyViewModel0, CommentModifyViewModel.class, "onClickComplete", "onClickComplete(ZLcom/kakao/tistory/presentation/view/entry/widget/CommentCompletion;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((CommentCompletion)object1), "p1");
        CommentModifyViewModel.access$onClickComplete(((CommentModifyViewModel)this.receiver), ((Boolean)object0).booleanValue(), ((CommentCompletion)object1));
        return Unit.INSTANCE;
    }
}

