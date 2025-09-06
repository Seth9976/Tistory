package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class g extends FunctionReferenceImpl implements Function0 {
    public g(BlogFollowViewModel blogFollowViewModel0) {
        super(0, blogFollowViewModel0, BlogFollowViewModel.class, "followerLoadComplete", "followerLoadComplete()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((BlogFollowViewModel)this.receiver).followerLoadComplete();
        return Unit.INSTANCE;
    }
}

