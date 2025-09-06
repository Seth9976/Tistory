package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class c0 extends FunctionReferenceImpl implements Function1 {
    public c0(BlogFollowViewModel blogFollowViewModel0) {
        super(1, blogFollowViewModel0, BlogFollowViewModel.class, "onClickFollow", "onClickFollow(Lcom/kakao/tistory/domain/entity/Blog;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "p0");
        ((BlogFollowViewModel)this.receiver).onClickFollow(((Blog)object0));
        return Unit.INSTANCE;
    }
}

