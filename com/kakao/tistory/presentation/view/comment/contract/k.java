package com.kakao.tistory.presentation.view.comment.contract;

import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class k extends FunctionReferenceImpl implements Function0 {
    public k(CommentListViewModel commentListViewModel0) {
        super(0, commentListViewModel0, CommentListViewModel.class, "goToDetailPinnedComment", "goToDetailPinnedComment()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((CommentListViewModel)this.receiver).goToDetailPinnedComment();
        return Unit.INSTANCE;
    }
}

