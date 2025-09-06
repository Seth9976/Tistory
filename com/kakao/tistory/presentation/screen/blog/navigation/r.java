package com.kakao.tistory.presentation.screen.blog.navigation;

import com.kakao.tistory.presentation.ActivityNavigator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class r extends FunctionReferenceImpl implements Function1 {
    public r(ActivityNavigator activityNavigator0) {
        super(1, activityNavigator0, ActivityNavigator.class, "navigateToRefererKeyword", "navigateToRefererKeyword(Ljava/util/List;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "p0");
        ((ActivityNavigator)this.receiver).navigateToRefererKeyword(((List)object0));
        return Unit.INSTANCE;
    }
}

