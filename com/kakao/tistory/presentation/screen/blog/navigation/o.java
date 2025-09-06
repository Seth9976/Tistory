package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import com.kakao.tistory.presentation.viewmodel.BlogFollowViewModel.Type;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public final ActivityNavigator a;

    public o(ActivityNavigator activityNavigator0) {
        this.a = activityNavigator0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        this.a.navigateToFollowScreen(((String)object0), Type.FOLLOWER);
        return Unit.INSTANCE;
    }
}

