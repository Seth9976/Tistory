package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class l extends FunctionReferenceImpl implements Function1 {
    public l(BlogFollowViewModel blogFollowViewModel0) {
        super(1, blogFollowViewModel0, BlogFollowViewModel.class, "onClickFollower", "onClickFollower(Lcom/kakao/tistory/domain/entity/User;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((User)object0), "p0");
        ((BlogFollowViewModel)this.receiver).onClickFollower(((User)object0));
        return Unit.INSTANCE;
    }
}

